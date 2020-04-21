package com.greenfoxacademy.exercises.controllers;

import com.greenfoxacademy.exercises.models.BankAccount;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @GetMapping("/show")
  public String showDetails(Model model){
    BankAccount account = new BankAccount("Simba", 2000, "lion", true);
    model.addAttribute("simba", account);
    return "index";
  }

  @GetMapping("/htmlception")
  public String displayText(Model model){
    String stringToDisplay = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", stringToDisplay);
    return "htmlception";
  }

  @GetMapping("/accounts")
  public String showAccounts(Model model){
    List<BankAccount> bankAccounts = new ArrayList<>();

    bankAccounts.add(new BankAccount("Rafiki", 17894.47, "mandrill", false));
    bankAccounts.add(new BankAccount("Simba", 2000.337, "lion", true));
    bankAccounts.add(new BankAccount("Zazu", 478.12, "red-billed hornbill", false));
    bankAccounts.add(new BankAccount("Banzai", -677.65, "hyena",false));
    bankAccounts.add(new BankAccount("Scar", 560049000.98, "lion", false));

    model.addAttribute("accounts", bankAccounts);

    return "accounts";
  }
}
