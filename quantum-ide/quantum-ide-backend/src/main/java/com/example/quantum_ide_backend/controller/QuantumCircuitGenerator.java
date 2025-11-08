package com.example.quantum_ide_backend.controller;

import org.antlr.runtime.tree.*;
import java.util.*;

public class QuantumCircuitGenerator {
    private QuantumCircuit circuit = new QuantumCircuit();
    private int column = 0;
    private final Map<String, CommonTree> customGates = new HashMap<>();
    private final Map<String, CommonTree> customFuncs = new HashMap<>();

    public QuantumCircuit generate(CommonTree ast) {
        visit(ast);
        return circuit;
    }

    void visit(Tree node) {
        if (node == null) return;

        switch (node.getType()) {
            case QuantumParser.QUBIT:
                handleQubitDecl(node);
                break;
            case QuantumParser.BIT:
                handleBitDecl(node);
                break;
            case QuantumParser.REGISTER:
                handleRegister(node);
                break;
            case QuantumParser.GATE_DECL:
                handleGateDefinition(node);
                break;
            case QuantumParser.FUNC_DECL:
                handleFuncDefinition(node);
                break;
            case QuantumParser.FUNCTION_CALL:
                handleFuncCall(node);
                break;
            case QuantumParser.GATE_APPLY:
                handleGateApply(node);
                break;
            case QuantumParser.MEASURE:
                handleMeasure(node);
                break;
            case QuantumParser.IF:
            case QuantumParser.WHILE:
            case QuantumParser.FOR:
                for (int i = 0; i < node.getChildCount(); i++) {
                    visit(node.getChild(i));
                }
                break;
            case QuantumParser.RESET:
                handleReset(node);
                break;
            // Gestione diretta dei gate atomici (H, X, ecc.)
            case QuantumParser.H:
            case QuantumParser.X:
            case QuantumParser.Y:
            case QuantumParser.Z:
            case QuantumParser.S:
            case QuantumParser.T:           
            case QuantumParser.CNOT:
            case QuantumParser.SWAP:
            case QuantumParser.ISWAP:
            case QuantumParser.CCX:
            case QuantumParser.CSWAP:
                handleSimpleGate(node);
                break;
            case QuantumParser.RX:
            case QuantumParser.RY:
            case QuantumParser.RZ:
            case QuantumParser.U1:
            case QuantumParser.U2:
            case QuantumParser.U3:
                handleParameterizedGate(node);
                break;
            default:
                for (int i = 0; i < node.getChildCount(); i++) {
                    visit(node.getChild(i));
                }
                break;
        }
    }

    private void handleQubitDecl(Tree node) {
        String name = node.getChild(0).getText();
        circuit.addQubit(name);
    }

    private void handleBitDecl(Tree node) {
        String name = node.getChild(0).getText();
        circuit.addBit(name);
    }

    private void handleRegister(Tree node) {
        String name = node.getChild(0).getText();
        int size = Integer.parseInt(node.getChild(1).getText());
        if (node.getParent().getType() == QuantumParser.QUBIT) {
            for (int i = 0; i < size; i++) {
                circuit.addQubit(name + "[" + i + "]");
            }
        } else if (node.getParent().getType() == QuantumParser.BIT) {
            for (int i = 0; i < size; i++) {
                circuit.addBit(name + "[" + i + "]");
            }
        }
    }

    private void handleFuncDefinition(Tree node) {
        String name = node.getChild(0).getText();
        customFuncs.put(name, (CommonTree) node);
    }

    private void handleFuncCall(Tree node) {
        String name = node.getChild(0).getText();
        if (!customFuncs.containsKey(name)) return;
        List<String> args = new ArrayList<>();
        for (int i = 1; i < node.getChildCount(); i++) {
            args.add(node.getChild(i).getText());
        }
        expandCustomGate(name, args);
    }

    private void handleGateDefinition(Tree node) {
        String name = node.getChild(0).getText();
        customGates.put(name, (CommonTree) node);
    }

    private void handleGateApply(Tree node) {
        String gateName = node.getChild(0).getText();
        List<String> targets = new ArrayList<>();
        List<String> params = new ArrayList<>();

        for (int i = 1; i < node.getChildCount(); i++) {
            Tree child = node.getChild(i);
            int type = child.getType();

            if (type == QuantumParser.ID) {
                String var = child.getText();
                targets.add(var);

                // ✅ aggiungi automaticamente un qubit se non esiste
                if (!circuit.getQubits().contains(var)) {
                    circuit.addQubit(var);
                }
            } else if (type == QuantumParser.INT ||
                       type == QuantumParser.FLOAT ||
                       type == QuantumParser.PI ||
                       type == QuantumParser.EULER ||
                       type == QuantumParser.SQRT2) {
                params.add(child.getText());
            } else {
                String exprText = flattenExpression(child);
                if (exprText != null && !exprText.isEmpty()) {
                    params.add(exprText);
                }
            }
        }

        if (customGates.containsKey(gateName)) {
            expandCustomGate(gateName, targets);
            return;
        }

        CircuitOperation op = CircuitOperation.gate(gateName, params, targets);
        op.setColumn(column++);
        circuit.addOperation(op);
    }

    private void expandCustomGate(String name, List<String> args) {
        CommonTree def = customGates.getOrDefault(name, customFuncs.get(name));
        if (def == null) return;

        List<String> params = new ArrayList<>();
        CommonTree paramList = (CommonTree) def.getChild(1);
        for (int i = 0; i < paramList.getChildCount(); i++) {
            params.add(paramList.getChild(i).getText());
        }

        CommonTree body = (CommonTree) def.getChild(def.getChildCount() - 1);

        Map<String, String> context = new HashMap<>();
        for (int i = 0; i < params.size(); i++) {
            if (i < args.size()) {
                context.put(params.get(i), args.get(i));
            }
        }

        expandGateBody(body, context);
    }

    private void expandGateBody(Tree body, Map<String, String> context) {
        for (int i = 0; i < body.getChildCount(); i++) {
            Tree stmt = body.getChild(i);

            if (stmt.getType() == QuantumParser.GATE_APPLY) {
                String gateName = stmt.getChild(0).getText();
                List<String> targets = new ArrayList<>();
                List<String> params = new ArrayList<>();

                for (int j = 1; j < stmt.getChildCount(); j++) {
                    Tree child = stmt.getChild(j);
                    int type = child.getType();

                    if (type == QuantumParser.ID) {
                        String var = child.getText();
                        String resolved = context.getOrDefault(var, var);
                        targets.add(resolved);

                        // ✅ aggiungi anche qui i qubit mancanti
                        if (!circuit.getQubits().contains(resolved)) {
                            circuit.addQubit(resolved);
                        }
                    } else if (type == QuantumParser.INT ||
                               type == QuantumParser.FLOAT ||
                               type == QuantumParser.PI ||
                               type == QuantumParser.EULER ||
                               type == QuantumParser.SQRT2) {
                        params.add(child.getText());
                    } else {
                        String exprText = flattenExpression(child);
                        if (exprText != null && !exprText.isEmpty()) {
                            params.add(exprText);
                        }
                    }
                }

                if (customGates.containsKey(gateName)) {
                    expandCustomGate(gateName, targets);
                    continue;
                }

                CircuitOperation op = CircuitOperation.gate(gateName, params, targets);
                op.setColumn(column++);
                circuit.addOperation(op);
            }
        }
    }

    private void handleSimpleGate(Tree node) {
        String gateName = node.getText();
        List<String> targets = new ArrayList<>();

        for (int i = 0; i < node.getChildCount(); i++) {
            Tree child = node.getChild(i);
            if (child.getType() == QuantumParser.ID) {
                String var = child.getText();
                targets.add(var);
                // ✅ aggiungi qubit mancanti
                if (!circuit.getQubits().contains(var)) {
                    circuit.addQubit(var);
                }
            }
        }

        if (!targets.isEmpty()) {
            CircuitOperation op = CircuitOperation.gate(gateName, new ArrayList<>(), targets);
            op.setColumn(column++);
            circuit.addOperation(op);
        }
    }

    // Gestione generica di porte parametrizzate (RX, RY, RZ, U1, U2, U3, ecc.)
private void handleParameterizedGate(Tree node) {
    // Ricava il nome della porta: può essere il testo del nodo o del primo figlio
    String gateName = (node.getChildCount() > 0) ? node.getText().toUpperCase() : node.getText().toUpperCase();
    // Normalizza: se la grammatica ha il nome come child[0], usalo
    if (node.getChildCount() > 0 && node.getChild(0) != null) {
        String maybe = node.getChild(0).getText();
        if (maybe != null && !maybe.isEmpty()) {
            // preferiamo il nome del nodo se corrisponde a un token (es. "RX")
            gateName = maybe.toUpperCase();
        }
    }

    List<String> targets = new ArrayList<>();
    List<String> params = new ArrayList<>();

    // Scansione difensiva: esplora tutti i figli diretti e raccoglie ID e parametri/espresioni
    for (int i = 1; i < node.getChildCount(); i++) {
        Tree child = node.getChild(i);
        if (child == null) continue;
        int type = child.getType();

        // identificatore → target (qubit)
        if (type == QuantumParser.ID) {
            String t = child.getText();
            targets.add(t);
            if (!circuit.getQubits().contains(t)) circuit.addQubit(t); // aggiungi se mancante
        }
        // numero o costante → parametro
        else if (type == QuantumParser.INT ||
                 type == QuantumParser.FLOAT ||
                 type == QuantumParser.PI ||
                 type == QuantumParser.EULER ||
                 type == QuantumParser.SQRT2) {
            params.add(child.getText());
        }
        // altrimenti prova a "appiattire" l'espressione (es. PI/2, 1+2, sin(PI/2))
        else {
            String expr = flattenExpression(child);
            if (expr != null && !expr.isEmpty()) {
                // Se è un identificatore singolo (es. una variabile), potremmo aver già trattato, ma qui lo consideriamo parametro
                params.add(expr);
            }
        }
    }

    // Se non ho trovato target/param dal livello diretto, provo a cercare ricorsivamente
    // (utile se la grammatica incapsula param/target in sotto-nodi)
    if (targets.isEmpty() || params.isEmpty()) {
        collectParamsAndTargetsRecursive(node, targets, params);
        // assicuro i qubit trovati
        for (String t : targets) {
            if (!circuit.getQubits().contains(t)) circuit.addQubit(t);
        }
    }

    // Se è un custom gate (anche parametrizzato), espando usando lo stesso meccanismo
    if (customGates.containsKey(gateName)) {
        expandCustomGate(gateName, targets);
        return;
    }

    // Crea l'operazione e aggiungila al circuito
    CircuitOperation op = CircuitOperation.gate(gateName, params, targets);
    op.setColumn(column++);
    circuit.addOperation(op);
}

// Funzione helper ricorsiva per cercare identificatori/parametri dentro il sotto-albero
private void collectParamsAndTargetsRecursive(Tree node, List<String> targets, List<String> params) {
    if (node == null) return;
    for (int i = 0; i < node.getChildCount(); i++) {
        Tree child = node.getChild(i);
        if (child == null) continue;
        int type = child.getType();

        if (type == QuantumParser.ID) {
            String t = child.getText();
            if (!targets.contains(t)) targets.add(t);
        } else if (type == QuantumParser.INT ||
                   type == QuantumParser.FLOAT ||
                   type == QuantumParser.PI ||
                   type == QuantumParser.EULER ||
                   type == QuantumParser.SQRT2) {
            String p = child.getText();
            if (!params.contains(p)) params.add(p);
        } else {
            // prova ad appiattire ed eventualmente considerarlo come parametro
            String expr = flattenExpression(child);
            if (expr != null && !expr.isEmpty()) {
                if (!params.contains(expr)) params.add(expr);
            }
            // ricorsione
            collectParamsAndTargetsRecursive(child, targets, params);
        }
    }
}


    private void handleMeasure(Tree node) {
        String from = node.getChild(0).getText();
        String to = node.getChild(1).getText();

        if (!circuit.getQubits().contains(from)) circuit.addQubit(from);
        if (!circuit.getBits().contains(to)) circuit.addBit(to);

        CircuitOperation op = CircuitOperation.measure(from, to);
        op.setColumn(column++);
        circuit.addOperation(op);
    }

    private void handleReset(Tree node) {
        String target = node.getChild(0).getText();
        if (!circuit.getQubits().contains(target)) circuit.addQubit(target);

        CircuitOperation op = CircuitOperation.gate("RESET", new ArrayList<>(), List.of(target));
        op.setColumn(column++);
        circuit.addOperation(op);
    }

    private String flattenExpression(Tree exprNode) {
        if (exprNode == null) return "";
        if (exprNode.getChildCount() == 0)
            return exprNode.getText();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < exprNode.getChildCount(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(flattenExpression(exprNode.getChild(i)));
        }

        if (exprNode.getText() != null && !exprNode.getText().matches("[0-9A-Za-z_]+")) {
            return exprNode.getChildCount() > 1
                    ? "(" + sb.toString().trim() + " " + exprNode.getText() + ")"
                    : sb.toString().trim();
        }

        return sb.toString().trim();
    }
}
