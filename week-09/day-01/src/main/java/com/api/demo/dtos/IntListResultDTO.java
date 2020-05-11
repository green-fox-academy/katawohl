package com.api.demo.dtos;

import java.util.ArrayList;
import java.util.List;

public class IntListResultDTO {
    private List<Integer> result;

    public IntListResultDTO() {
        this.result = new ArrayList<>();
    }

    public IntListResultDTO(List<Integer> result) {
        this.result = result;
    }

    public List<Integer> getResult() {
        return result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }
}
