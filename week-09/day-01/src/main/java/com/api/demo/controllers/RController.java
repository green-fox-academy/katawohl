package com.api.demo.controllers;

import com.api.demo.models.*;
import com.api.demo.models.arrayhandler.*;
//import com.api.demo.services.ArrayHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RController {
   /* private ArrayHandlerService arrayHandlerService;

    @Autowired
    public RController(ArrayHandlerService arrayHandlerService){
        this.arrayHandlerService = arrayHandlerService;
    }*/

    @GetMapping("/doubling")
    public ResponseEntity<?> giveDouble(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return new ResponseEntity(new ErrorMessage("Please provide an input!"), HttpStatus.OK);
        } else {
            return new ResponseEntity(new Doubling(input), HttpStatus.OK);
        }
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            return new ResponseEntity(new ErrorMessage("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
        }
        if (name == null) {
            return new ResponseEntity(new ErrorMessage("Please provide a name!"), HttpStatus.BAD_REQUEST);
        }
        if (title == null) {
            return new ResponseEntity(new ErrorMessage("Please provide a title!"), HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>(new Greeter(name, title), HttpStatus.OK);
        }
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appenda(@PathVariable(name = "appendable") String appendable) {
        if (appendable != null) {
            Appended appended = new Appended(appendable);
            return ResponseEntity.ok().body(appended);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@RequestBody DoUntil doUntil, @PathVariable(name = "action") String action) {
        DoUntilAction doUntilAction = new DoUntilAction();
        if (doUntil != null) {
            doUntilAction.doUntilAction(doUntil.getUntil(), action);
            return ResponseEntity.ok().body(doUntilAction);
        } else {
            return new ResponseEntity(new ErrorMessage("Please provide a number!"), HttpStatus.OK);
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> handleArray(@RequestBody ArrayHandler arrayHandler){
        if (arrayHandler.getWhat().equals("sum")){
            return ResponseEntity.ok().body(new ArrayHandlerResultSum(arrayHandler));
        } if (arrayHandler.getWhat().equals("multiply")){
            return ResponseEntity.ok().body(new ArrayHandlerResultFactor(arrayHandler));
        } else {
            return ResponseEntity.ok().body(new ArrayHandlerResultDoubling(arrayHandler));
        }
       // return ResponseEntity.ok().body(arrayHandlerService.calculate(arrayHandler));
    }

}
