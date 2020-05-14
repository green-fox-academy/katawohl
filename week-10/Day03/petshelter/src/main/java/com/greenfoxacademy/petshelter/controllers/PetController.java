package com.greenfoxacademy.petshelter.controllers;

import com.greenfoxacademy.petshelter.services.HumanService;
import com.greenfoxacademy.petshelter.services.HumanServiceImpl;
import com.greenfoxacademy.petshelter.services.PetService;
import com.greenfoxacademy.petshelter.services.PetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetController {

    PetService petService;
    HumanService humanService;

    @Autowired
    public PetController(PetServiceImpl petService, HumanServiceImpl humanService) {
        this.petService = petService;
        this.humanService = humanService;
    }

    @GetMapping("/list-pets")
    public String renderPetListPage(Model model){
        model.addAttribute("pets", petService.listAllPets());
        return "petList";
    }
}
