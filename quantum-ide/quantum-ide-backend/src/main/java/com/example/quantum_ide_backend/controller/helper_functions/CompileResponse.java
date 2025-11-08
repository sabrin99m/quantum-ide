package com.example.quantum_ide_backend.controller.helper_functions;

import java.util.List;

public class CompileResponse {
    private boolean success;
    private String message;
    private List<String> errors;

    // Getters e Setters
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public List<String> getErrors() { return errors; }
    public void setErrors(List<String> errors) { this.errors = errors; }
}
