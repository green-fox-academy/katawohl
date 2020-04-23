package com.greenfoxacdemy.di.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful/colored")
  public String background(Model model) {
    String randomColor = utilityService.randomColor();
    model.addAttribute("color", randomColor);
    return "index";
  }

  @GetMapping("/useful/email")
  public String validateInput(@RequestParam String email, Model model) {
    boolean ifValid = utilityService.validateEmail(email);
    model.addAttribute("email", email);
    model.addAttribute("ifValid", ifValid);
    return "validemail";
  }

  @GetMapping("/useful/encoder")
  public String encodeText(@RequestParam String text, @RequestParam int num, Model model) {
    String resultText = utilityService.caesar(text, num);
    model.addAttribute("text", resultText);
    return "index";
  }

  @GetMapping("/useful/decoder")
  public String decodeText(@RequestParam String text, @RequestParam int num, Model model) {
    int negNum = -num;
    String resultText = utilityService.caesar(text, negNum);
    model.addAttribute("text", resultText);
    return "index";
  }

}
