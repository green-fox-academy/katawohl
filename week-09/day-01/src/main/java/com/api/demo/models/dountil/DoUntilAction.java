package com.api.demo.models.dountil;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DoUntilAction {
    @JsonProperty("result")
    private int result;

    public void setResult(int result) {
        this.result = result;
    }

    public void doUntilSum(int until) {
        this.result = 0;
        for (int i = 1; i <= until; i++) {
            this.result += i;
        }
    }

    public void doUntilFactor(int until) {
        this.result = 1;
        for (int i = 1; i <= until; i++) {
            this.result *= i;
        }
    }

    public void doUntilAction(int until, String action) {
        switch (action) {
            case "sum":
                this.doUntilSum(until);
                break;
            case "factor":
                this.doUntilFactor(until);
                break;
        }
    }
}
