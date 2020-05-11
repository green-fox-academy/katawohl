
package com.api.demo.services;

import com.api.demo.dtos.IntListResultDTO;
import com.api.demo.dtos.IntResultDTO;
import com.api.demo.models.ArrayHandler;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArrayHandlerService {

    public IntResultDTO calculateSum(ArrayHandler arrayHandler) {
        IntResultDTO intResultDTO = new IntResultDTO();
        Integer sumOfNums = 0;
        for (int i = 0; i < arrayHandler.getNumbers().size(); i++) {
            sumOfNums += arrayHandler.getNumbers().get(i);
        }
        intResultDTO.setResult(sumOfNums);
        return intResultDTO;
    }

    public IntResultDTO calculateFactor(ArrayHandler arrayHandler){
        IntResultDTO intResultDTO = new IntResultDTO();
        Integer multOfNums = 1;
        for (int i = 0; i < arrayHandler.getNumbers().size(); i++) {
            multOfNums *= arrayHandler.getNumbers().get(i);
        }
        intResultDTO.setResult(multOfNums);
        return intResultDTO;
    }

    public IntListResultDTO calculateDouble(ArrayHandler arrayHandler){
        IntListResultDTO intListResultDTO = new IntListResultDTO();
        List<Integer> doubledList = new ArrayList<>();
        for (Integer number : arrayHandler.getNumbers()) {
            doubledList.add(number*2);
        }
        intListResultDTO.setResult(doubledList);
        return intListResultDTO;
    }



}

