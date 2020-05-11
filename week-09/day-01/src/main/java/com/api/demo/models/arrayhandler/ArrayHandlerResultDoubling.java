package com.api.demo.models.arrayhandler;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class ArrayHandlerResultDoubling{
    @JsonIgnore
    private ArrayHandler arrayHandler;
    private List<Integer> result;

    public ArrayHandlerResultDoubling (ArrayHandler arrayHandler){
        this.arrayHandler = arrayHandler;
        this.result = arrayHandler.doubleList();
    }

    public ArrayHandler getArrayHandler() {
        return arrayHandler;
    }

    public void setArrayHandler(ArrayHandler arrayHandler) {
        this.arrayHandler = arrayHandler;
    }

    public List<Integer> getResult() {
        return result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }
}
