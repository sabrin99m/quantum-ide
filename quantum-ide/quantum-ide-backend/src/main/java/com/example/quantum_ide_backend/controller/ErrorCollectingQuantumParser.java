package com.example.quantum_ide_backend.controller;

import org.antlr.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class ErrorCollectingQuantumParser extends QuantumParser {

    private final List<String> errors = new ArrayList<>();

    public ErrorCollectingQuantumParser(TokenStream input) {
        super(input);
    }

    @Override
    public void reportError(RecognitionException e) {
        String msg;

        if (e instanceof MissingTokenException) {
            MissingTokenException mte = (MissingTokenException) e;
            String expected = (mte.expecting >= 0 && tokenNames != null && mte.expecting < tokenNames.length)
                    ? tokenNames[mte.expecting]
                    : "unknown";

            // Indichiamo la posizione del token mancante rispetto al token precedente
            Token currentToken = e.token != null ? e.token : getTokenStream().LT(1);
            msg = "Syntax error: missing token " + expected +
                  " before '" + currentToken.getText() + "'" +
                  " at line" + currentToken.getLine() +
                  ":" + currentToken.getCharPositionInLine();

        } else if (e instanceof MismatchedTokenException) {
            MismatchedTokenException mte = (MismatchedTokenException) e;
            String expected = (mte.expecting >= 0 && tokenNames != null && mte.expecting < tokenNames.length)
                    ? tokenNames[mte.expecting]
                    : "unknown";
            Token currentToken = e.token != null ? e.token : getTokenStream().LT(1);
            msg = "Syntax error: found '" + currentToken.getText() + "', expected " + expected +
                  " at line " + currentToken.getLine() +
                  ":" + currentToken.getCharPositionInLine();

        } else {
            Token currentToken = e.token != null ? e.token : getTokenStream().LT(1);
            msg = "Syntax error at line " + currentToken.getLine() +
                  ":" + currentToken.getCharPositionInLine() + " - " + e.getMessage();
        }

        errors.add(msg);
    }


	    @Override
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	        // ANTLR chiama questo metodo per errori non Recovery
	        String msg = getErrorHeader(e) + " " + getErrorMessage(e, tokenNames);
	        errors.add(msg);
	    }

	    public List<String> getErrors() {
	        return errors;
	    }
}
