package com.example.quantum_ide_backend.controller;

import java.util.*;
import org.antlr.runtime.tree.CommonTree;

public class QuantumSemanticAnalyzer {
    private final Deque<Map<String, String>> scopes = new ArrayDeque<>();
    private final List<String> errors = new ArrayList<>();

    public void analyze(CommonTree ast) {
        initSymbolTable();
        visit(ast);
        checkProgramConsistency();
    }

    // --- Inizializzazione simboli globali ---
    private void initSymbolTable() {
        scopes.clear();
        scopes.push(new HashMap<>());

        // Gate built-in
        String[] gates = {"H","X","Y","Z","S","T","RX","RY","RZ","U1","U2","U3",
                          "CNOT","SWAP","ISWAP","CCX","CSWAP"};
        for (String g : gates) declareInCurrentScope(g, "gate");

        // Costanti matematiche
        declareInCurrentScope("PI", "float");
        declareInCurrentScope("EULER", "float");
    }

    // --- Scope helpers ---
    private void enterScope() { scopes.push(new HashMap<>()); }

    private void exitScope() {
        if (!scopes.isEmpty()) scopes.pop();
        if (scopes.isEmpty()) scopes.push(new HashMap<>());
    }

    /**
     * Dichiara senza nodo (nessuna posizione disponibile).
     * Mantiene compatibilità con codice che passava solo nome e tipo.
     */
    private void declareInCurrentScope(String name, String type) {
        Map<String, String> cur = scopes.peek();
        if (cur.containsKey(name)) {
            // non abbiamo il nodo per la posizione -> errore senza posizione
            errors.add("Variable still declared: " + name);
        } else {
            cur.put(name, type);
        }
    }

    /**
     * Dichiara con nodo (se disponibile) così possiamo fornire la posizione dell'errore.
     */
    private void declareInCurrentScope(CommonTree node, String type) {
        if (node == null) return;
        String name = node.getText();
        Map<String, String> cur = scopes.peek();
        if (cur.containsKey(name)) {
            addError(node, "Variable still declared: " + name);
        } else {
            cur.put(name, type);
        }
    }

    private String lookup(String name) {
        for (Map<String, String> scope : scopes) {
            if (scope.containsKey(name)) return scope.get(name);
        }
        return null;
    }


    // --- Visita AST ---
    private void visit(CommonTree node) {
        if (node == null) return;

        boolean openedScope = false;

        switch (node.getType()) {
            case QuantumParser.GATE:
                // il primo figlio è il nome del gate (se presente)
                if (node.getChildCount() > 0 && node.getChild(0) != null) {
                    // registra la dichiarazione con posizione se possibile
                    declareInCurrentScope((CommonTree) node.getChild(0), "gate");
                }
                enterScope();
                openedScope = true;
                declareParamsBeforeBlock(node, true); // parametri gate sempre qubit
                break;

            case QuantumParser.FUNC:
                if (node.getChildCount() > 0 && node.getChild(0) != null) {
                    declareInCurrentScope((CommonTree) node.getChild(0), "func");
                }
                enterScope();
                openedScope = true;
                declareParamsBeforeBlock(node, false); // parametri funzione inizialmente unknown
                break;

            case QuantumParser.BLOCK:
                enterScope();
                openedScope = true;
                break;

            case QuantumParser.QUBIT:
                if (node.getChildCount() > 0 && node.getChild(0) != null) {
                    declareInCurrentScope((CommonTree) node.getChild(0), "qubit");
                }
                break;

            case QuantumParser.BIT:
                if (node.getChildCount() > 0 && node.getChild(0) != null) {
                    declareInCurrentScope((CommonTree) node.getChild(0), "bit");
                }
                break;

            case QuantumParser.REGISTER:
                if (node.getChildCount() > 0 && node.getChild(0) != null) {
                    declareInCurrentScope((CommonTree) node.getChild(0), "register");
                }
                break;
        }

        // visita figli
        for (int i = 0; i < node.getChildCount(); i++) {
            CommonTree ch = (CommonTree) node.getChild(i);
            if (ch == null) continue;

            // se il nodo corrente è un ASSIGN e ch è il target (primo figlio), non chiamare handleIdentifier subito
            boolean skipIdentifier = node.getType() == QuantumParser.ASSIGN && i == 0;
            if (!skipIdentifier) visit(ch);
        }

        // post-visit actions
        switch (node.getType()) {
            case QuantumParser.MEASURE:
                handleMeasure(node);
                break;
            case QuantumParser.ASSIGN:
                handleAssignment(node);
                break;
            case QuantumParser.ID:
                handleIdentifier(node);
                break;
            default:
                if (isConcreteGateNode(node.getType())) {
                    int expected = gateArity(node.getType());
                    checkGateApplication(node, expected);
                }
                break;
        }

        if (openedScope) exitScope();
    }

    // --- Dichiarazione parametri ---
    private void declareParamsBeforeBlock(CommonTree node, boolean asQubit) {
        int childCount = node.getChildCount();
        int blockIndex = -1;
        for (int i = 0; i < childCount; i++) {
            CommonTree c = (CommonTree) node.getChild(i);
            if (c != null && c.getType() == QuantumParser.BLOCK) {
                blockIndex = i;
                break;
            }
        }
        int start = 1;
        int end = (blockIndex == -1) ? childCount - 1 : blockIndex - 1;

        Map<String,String> cur = scopes.peek();
        for (int i = start; i <= end; i++) {
            CommonTree c = (CommonTree) node.getChild(i);
            if (c != null && c.getType() == QuantumParser.ID) {
                String pname = c.getText();
                if (!cur.containsKey(pname)) {
                    cur.put(pname, asQubit ? "qubit" : "unknown");
                } else {
                    // se già dichiarato nel current scope -> segnala con posizione
                    addError(c, "Variable still declared: " + pname);
                }
            }
        }
    }

    // --- Identificatori ---
    private void handleIdentifier(CommonTree node) {
        String name = node.getText();
        if (name == null) return;

        // se non è dichiarata nello scope globale o locale -> errore con posizione
        String type = lookup(name);
        if (type == null) {
            addError(node, "Variable not declared: " + name);
        }
    }

    // --- Controllo gate ---
    private void checkGateApplication(CommonTree node, int expectedQubits) {
        if (node == null) return;
        List<String> ids = new ArrayList<>();
        // raccogli gli ID figli e tienili anche come nodi per posizione
        List<CommonTree> idNodes = new ArrayList<>();
        for (int i = 0; i < node.getChildCount(); i++) {
            CommonTree c = (CommonTree) node.getChild(i);
            if (c != null && c.getType() == QuantumParser.ID) {
                ids.add(c.getText());
                idNodes.add(c);
            }
        }
        if (ids.isEmpty()) return;

        int m = ids.size();
        if (m < expectedQubits) {
            addError(node, "Gate " + node.getText() + " with not enough arguments.");
            return;
        }

        for (int k = m - expectedQubits; k < m; k++) {
            String target = ids.get(k);
            CommonTree targetNode = idNodes.size() > (k) ? idNodes.get(k) : null;
            String type = lookup(target);
            if (type == null) {
                addError(targetNode, "Use of not declared variable: " + target);
            } else if (type.equals("unknown")) {
                // inferenza tipo: parametro funzione usato in gate diventa qubit
                scopes.peek().put(target, "qubit");
            } else if (!type.equals("qubit") && !type.equals("param") && !type.equals("register")) {
                addError(targetNode, "Gate " + node.getText() + " requires a qubit, but " + target + " is of type " + type);
            }
        }
    }

    // --- Misura ---
    private void handleMeasure(CommonTree node) {
        if (node.getChildCount() != 2) {
            addError(node, "MEASURE requires two arguments.");
            return;
        }
        CommonTree c0 = (CommonTree) node.getChild(0);
        CommonTree c1 = (CommonTree) node.getChild(1);
        if (c0 == null || c1 == null) return;

        String qubit = c0.getText();
        String bit = c1.getText();

        String qType = lookup(qubit);
        String bType = lookup(bit);

        // inferenza tipo qubit
        if (qType == null) {
            addError(c0, "Variable not declared: " + qubit);
        } else if (qType.equals("unknown")) {
            scopes.peek().put(qubit, "qubit");
        } else if (!qType.equals("qubit") && !qType.equals("param")) {
            addError(c0, "MEASURE must be applied on qubit only.");
        }

        // inferenza tipo bit
        if (bType == null) {
            // se non esiste, dichiariamo il bit qui (misura crea il bit implicito)
            scopes.peek().put(bit, "bit");
        } else if (bType.equals("unknown")) {
            scopes.peek().put(bit, "bit");
        } else if (!bType.equals("bit")) {
            addError(c1, "MEASURE result must be assigned to a bit.");
        }
    }

    private void handleAssignment(CommonTree node) {
        if (node.getChildCount() == 0) return;
        CommonTree targ = (CommonTree) node.getChild(0);
        if (targ == null) return;
        String target = targ.getText();
        String type = lookup(target);

        if (type == null) {
            // Dichiarazione implicita
            // usiamo il nodo target per registrare la dichiarazione (così eventuali future ridichiarazioni avranno posizione)
            declareInCurrentScope(targ, "unknown");
        }
    }

    private boolean isConcreteGateNode(int type) {
        switch (type) {
            case QuantumParser.H: case QuantumParser.X: case QuantumParser.Y:
            case QuantumParser.Z: case QuantumParser.S: case QuantumParser.T:
            case QuantumParser.RX: case QuantumParser.RY: case QuantumParser.RZ:
            case QuantumParser.U1: case QuantumParser.U2: case QuantumParser.U3:
            case QuantumParser.CNOT: case QuantumParser.SWAP: case QuantumParser.ISWAP:
            case QuantumParser.CCX: case QuantumParser.CSWAP:
                return true;
            default:
                return false;
        }
    }

    private int gateArity(int type) {
        switch (type) {
            case QuantumParser.CCX: case QuantumParser.CSWAP: return 3;
            case QuantumParser.CNOT: case QuantumParser.SWAP: case QuantumParser.ISWAP: return 2;
            default: return 1;
        }
    }

    private void checkProgramConsistency() {
        boolean hasQubit = scopes.stream().anyMatch(m -> m.containsValue("qubit"));
        if (!hasQubit) {
            // non abbiamo un nodo root => errore senza posizione
            errors.add("No qubits declared in the program.");
        }
    }

    // --- Helper per aggiungere errori con posizione quando possibile ---
    private void addError(CommonTree node, String msg) {
        if (node != null) {
            int line = node.getLine();
            int col = node.getCharPositionInLine();
            errors.add("line " + line + ":" + col + " " + msg);
        } else {
            errors.add(msg);
        }
    }

    public List<String> getErrors() { return errors; }
}