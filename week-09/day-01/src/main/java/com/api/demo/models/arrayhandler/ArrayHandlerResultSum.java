package com.api.demo.models.arrayhandler;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ArrayHandlerResultSum {
    @JsonIgnore
    private ArrayHandler arrayHandler;
    private int result;

    public ArrayHandlerResultSum (ArrayHandler arrayHandler){
        this.arrayHandler = arrayHandler;
        this.result = arrayHandler.sumNumbers();
    }

    public ArrayHandler getArrayHandler() {
        return arrayHandler;
    }

    public void setArrayHandler(ArrayHandler arrayHandler) {
        this.arrayHandler = arrayHandler;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
