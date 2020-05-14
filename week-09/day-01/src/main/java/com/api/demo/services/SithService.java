package com.api.demo.services;

import com.api.demo.dtos.SithOutputDTO;
import com.api.demo.models.SithInput;

public class SithService {
    public SithOutputDTO sithReverser(SithInput sithInput) {
        SithOutputDTO sithOutputDTO = new SithOutputDTO();
        String[] inputAsSentenceArray = sithInput.getText().split(".");
        for (String sentence : inputAsSentenceArray) {
            sentence.split(" ");
        }
        return sithOutputDTO;
    }
}
