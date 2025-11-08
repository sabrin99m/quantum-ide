package com.example.quantum_ide_backend.controller;

import org.antlr.runtime.CharStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorCollectingQuantumLexer extends QuantumLexer {
    private final List<String> errors = new ArrayList<>();

    public ErrorCollectingQuantumLexer(CharStream input) {
        super(input);
    }

    @Override
    public void emitErrorMessage(String msg) {
        // raccogliamo il messaggio invece di stamparlo su stderr
        errors.add(msg);
        // se vuoi anche vedere su stderr: super.emitErrorMessage(msg);
    }

    public List<String> getErrors() {
        return errors;
    }
}
