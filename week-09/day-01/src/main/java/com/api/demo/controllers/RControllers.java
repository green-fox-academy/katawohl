package com.api.demo.controllers;

import com.api.demo.models.Doubling;
import com.api.demo.models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RControllers {

    @GetMapping("/doubling")
    public ResponseEntity<?> giveDouble(@RequestParam(required = false) Integer input) {
       if (input == null){
           return new  ResponseEntity(new ErrorMessage("Please provide an input!"), HttpStatus.OK);
       } else {
           return new ResponseEntity(new Doubling(input), HttpStatus.OK);
       }
    }
}
