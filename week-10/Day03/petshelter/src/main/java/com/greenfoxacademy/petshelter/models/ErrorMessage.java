package com.greenfoxacademy.petshelter.models;

public class ErrorMessage {

    private String error;

    public ErrorMessage(String errorMessage) {
        this.error = errorMessage;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
