package com.greenfoxacademy.petshelter.controllers;

import com.greenfoxacademy.petshelter.models.Human;
import com.greenfoxacademy.petshelter.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private HumanService humanService;

  @Autowired
  public MainController(HumanService humanService) {
    this.humanService = humanService;
  }

  @GetMapping("/list-humans")
  public String listHumans(Model model) {
    model.addAttribute("humans", humanService.listAllHumans());
    return "index";
  }

  @GetMapping("/add-human")
  public String renderHumanEditPage(){
    return "edithuman";
  }

  @PostMapping("/add-human")
  public String addHuman(@ModelAttribute Human human){
    humanService.addHuman(human);
    return "redirect:/list-humans";
  }

  @GetMapping("/delete/{id}")
  public String deleteHuman(@PathVariable(name = "id") Long id){
    humanService.deleteHumanById(id);
    return "redirect:/list-humans";
  }

}
