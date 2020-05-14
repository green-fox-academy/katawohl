package com.greenfoxacademy.petshelter.controllers;

import com.greenfoxacademy.petshelter.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
