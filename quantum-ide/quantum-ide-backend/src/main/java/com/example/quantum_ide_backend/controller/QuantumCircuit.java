package com.example.quantum_ide_backend.controller;

import java.util.*;

public class QuantumCircuit {
    private List<String> qubits = new ArrayList<>();
    private List<String> bits = new ArrayList<>();
    private List<CircuitOperation> operations = new ArrayList<>();

    public List<String> getQubits() { return qubits; }
    public List<String> getBits() { return bits; }
    public List<CircuitOperation> getOperations() { return operations; }

    public void addQubit(String name) { if (!qubits.contains(name)) qubits.add(name); }
    public void addBit(String name) { if (!bits.contains(name)) bits.add(name); }
    public void addOperation(CircuitOperation op) { operations.add(op); }
}

