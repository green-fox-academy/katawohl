package com.greenfoxacademy.petshelter.controllers;

import com.greenfoxacademy.petshelter.models.Human;
import com.greenfoxacademy.petshelter.services.HumanService;
import com.greenfoxacademy.petshelter.services.HumanServiceImpl;
import com.greenfoxacademy.petshelter.services.PetService;
import com.greenfoxacademy.petshelter.services.PetServiceImpl;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HumanController {

    private HumanService humanService;
    private PetService petService;

    @Autowired
    public HumanController(HumanServiceImpl humanService, PetServiceImpl petService) {
        this.humanService = humanService;
        this.petService = petService;
    }

    @GetMapping("/list-humans")
    public String listHumans(Model model) {
        model.addAttribute("humans", humanService.listAllHumans());
        return "index";
    }

    @GetMapping("/add-human")
    public String renderHumanEditPage() {
        ;
        return "edithuman";
    }

    @PostMapping("/add-human")
    public String addHuman(@ModelAttribute Human human) {
        humanService.addHuman(human);
        return "redirect:/list-humans";
    }

    @GetMapping("/edit/{id}")
    public String renderEditPageById(@PathVariable(name = "id") Long id, Model model) {
        Human human = humanService.findById(id);

        model.addAttribute("id", id != null);
        model.addAttribute("found", human != null);
        model.addAttribute("human", human);
        return "edithuman";
    }

    @PostMapping("/edit/{id}")
    public String editHuman(@ModelAttribute Human human) {
        humanService.addHuman(human);
        return "redirect:/list-humans";
    }

    @GetMapping("/delete/{id}")
    public String deleteHuman(@PathVariable(name = "id") Long id) throws NotFoundException {
        humanService.deleteHumanById(id);
        return "redirect:/list-humans";
    }

}
