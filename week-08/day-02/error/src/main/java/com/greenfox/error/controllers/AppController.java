package com.greenfox.error.controllers;

import com.greenfox.error.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.greenfox.error.service.UserService;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping("/app")
public class AppController {
  UserService service;

  @Autowired
  public AppController(UserService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("new_user", new User());
    model.addAttribute("yolo", service.getAll());
    return "main";
  }

  @PostMapping("/app")
  public String create() {
    service.save(new User());
    return "redirect:/app/";
  }
}