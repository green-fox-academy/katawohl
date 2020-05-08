package com.api.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorMessage {
    @JsonProperty("error")
    private String error;

    public ErrorMessage(String error){
        this.error = error;
    }
}
