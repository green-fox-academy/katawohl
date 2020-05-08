package com.api.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeter {
    @JsonIgnore
    private String name;
    @JsonIgnore
    private String title;
    @JsonProperty("welcome_message")
    private String greeting;

    public Greeter(String name, String title) {
        this.name = name;
        this.title = title;
        this.greeting = "Oh, hi there " + name + ", my dear " + title + "!";
    }
}
