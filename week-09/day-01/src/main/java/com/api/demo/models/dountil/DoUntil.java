package com.api.demo.models.dountil;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoUntil {
    @JsonProperty("until")
    private int until;

    public int getUntil() {
        return until;
    }
}
