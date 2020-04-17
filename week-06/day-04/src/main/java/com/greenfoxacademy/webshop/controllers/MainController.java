package com.greenfoxacademy.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @GetMapping(value = "main")
  @ResponseBody
  public String hello(){
    return "Hello World";
  }

}

