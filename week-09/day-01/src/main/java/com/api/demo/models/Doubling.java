package com.api.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Doubling {
    @JsonProperty("received")
    private int received;
    @JsonProperty("result")
    private int result;

    public Doubling(int received) {
        this.received = received;
        this.result = received*2;
    }

    public void setReceived(int received) {
        this.received = received;
    }
}
