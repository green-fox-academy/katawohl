package com.greenfoxacademy.foxclub.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/{name}")
  public String showMain(@RequestParam String name, Model model) {
    model.addAttribute("foxName", name);
    return "index";
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String enterName(@RequestParam String name, Model model) {
    String redirect = "redirect:/?name=" + name;
    return redirect;
  }
}
