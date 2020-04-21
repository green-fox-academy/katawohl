package com.greenfoxacademy.exercises.controllers;

import com.greenfoxacademy.exercises.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @GetMapping("/show")
  public String showDetails(Model model){
    BankAccount account = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("simba", account);
    return "index";
  }

  @GetMapping("/htmlception")
  public String displayText(Model model){
    String stringToDisplay = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", stringToDisplay);
    return "htmlception";
  }
}
