package com.api.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Appended {
    @JsonProperty("appended")
    private String toAppend;

    public Appended(String toAppend){
        this.toAppend = toAppend + "a";
    }
}
