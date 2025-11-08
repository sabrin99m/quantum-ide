package com.example.quantum_ide_backend.controller;

import java.util.*;

public class CircuitOperation {
    private String name;              // "H", "CX", "MEASURE", ecc.
    private String type;              // "GATE" o "MEASURE"
    private List<String> targets;     // qubit su cui agisce
    private List<String> to;          // bit di destinazione per MEASURE
    private List<String> params;      // parametri numerici o angoli
    private int column;               // posizione nel circuito

    // --- Factory per i gate standard ---
    public static CircuitOperation gate(String gateName, List<String> params, List<String> targets) {
        CircuitOperation op = new CircuitOperation();
        op.type = "GATE";
        op.name = gateName;
        op.targets = targets != null ? targets : new ArrayList<>();
        op.params = params != null ? params : new ArrayList<>();
        op.to = new ArrayList<>();
        op.column = -1;
        return op;
    }

    // --- Factory per le misure ---
    public static CircuitOperation measure(String from, String toBit) {
        CircuitOperation op = new CircuitOperation();
        op.type = "MEASURE";
        op.name = "MEASURE";
        op.targets = List.of(from);
        op.to = List.of(toBit);
        op.params = new ArrayList<>();
        op.column = -1;
        return op;
    }

    // --- Getters (necessari per Jackson) ---
    public String getName() { return name; }
    public String getType() { return type; }
    public List<String> getTargets() { return targets; }
    public List<String> getTo() { return to; }
    public List<String> getParams() { return params; }
    public int getColumn() { return column; }

    // --- Setter opzionale per colonna (utile per layout grafico) ---
    public void setColumn(int column) { this.column = column; }
}


