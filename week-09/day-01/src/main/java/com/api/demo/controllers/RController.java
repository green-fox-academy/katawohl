package com.api.demo.controllers;

import com.api.demo.models.Appended;
import com.api.demo.models.Doubling;
import com.api.demo.models.ErrorMessage;
import com.api.demo.models.Greeter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

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
}
