package com.api.demo.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SithOutputDTO {
    @JsonProperty("sith_text")
    private String output;

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
