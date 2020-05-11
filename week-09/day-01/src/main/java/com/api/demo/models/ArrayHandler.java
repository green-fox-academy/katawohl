package com.api.demo.models;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {
    private String what;
    private List<Integer> numbers = new ArrayList();

    public String getWhat() {
        return what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Integer sumNumbers(){
        Integer sumOfNums = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sumOfNums += numbers.get(i);
        }
        return sumOfNums;
    }

    public Integer multiply(){
        Integer multOfNums = 1;
        for (int i = 0; i < this.numbers.size(); i++) {
            multOfNums *= numbers.get(i);
        }
        return multOfNums;
    }

    public List<Integer> doubleList(){
        List<Integer> doubledList = new ArrayList<>();
        for (Integer number : this.numbers) {
            doubledList.add(number*2);
        }
        return doubledList;
    }


}
