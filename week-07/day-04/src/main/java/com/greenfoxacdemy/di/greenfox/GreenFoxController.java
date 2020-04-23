package com.greenfoxacdemy.di.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreenFoxController {
  private StudentService studentService;

  @Autowired
  public GreenFoxController(StudentService studentService){
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String showMainPage(Model model){
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String showStudents(Model model){
    model.addAttribute("students", studentService.findAll());
    return "gfa";
  }
}
