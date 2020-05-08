package com.api.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoUntil {
    @JsonProperty("until")
    private int until;

    public int getUntil() {
        return until;
    }
}
