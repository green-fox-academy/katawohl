package com.greenfoxacademy.petshelter.controllers;

import com.greenfoxacademy.petshelter.models.ErrorMessage;
import com.greenfoxacademy.petshelter.models.Human;
import com.greenfoxacademy.petshelter.services.HumanService;
import com.greenfoxacademy.petshelter.services.HumanServiceImpl;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    HumanService humanService;

    @Autowired
    public APIController(HumanServiceImpl humanService) {
        this.humanService = humanService;
    }

    @GetMapping("/api/human/{id}")
    public ResponseEntity<?> giveHuman(@PathVariable(name = "id") Long id){
        Human human = humanService.findById(id);

        if (human != null){
            return ResponseEntity.ok().body(human);
        } else {
            return ResponseEntity.ok().body(new ErrorMessage("No human on the index " + id));
        }
    }

    @DeleteMapping("/api/delete/{id}")
    public ResponseEntity<?> deleteHumanById(@PathVariable(name = "id") Long id){
        try {
            humanService.deleteHumanById(id);
            return ResponseEntity.ok().build();
        } catch (NotFoundException ex){
            return new ResponseEntity(new ErrorMessage("No human on the index " + id), HttpStatus.NOT_FOUND);
        }

    }
}
