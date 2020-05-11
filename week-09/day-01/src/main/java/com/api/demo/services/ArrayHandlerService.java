/*
package com.api.demo.services;

import com.api.demo.models.arrayhandler.*;
import org.springframework.stereotype.Service;

@Service
public class ArrayHandlerService {

    public ArrayHandlerResult calculate(ArrayHandler arrayHandler) {
        ArrayHandlerResult arrayHandlerResult = new ArrayHandlerResult();
           switch (arrayHandler.getWhat()) {
            case "sum":
                arrayHandlerResult = new ArrayHandlerResultSum(arrayHandler);
            case "multiply":
                arrayHandlerResult = new ArrayHandlerResultFactor(arrayHandler);
            case "double":
                arrayHandlerResult = new ArrayHandlerResultDoubling(arrayHandler);
        }
        return arrayHandlerResult;
    }
}
*/
