package com.greenfox.exercises.controllers;

import com.greenfox.exercises.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
  List<BankAccount> bankAccounts = new ArrayList<>();

  public MainController() {

    bankAccounts.add(new BankAccount("Rafiki", 17894.47, "mandrill",
        BankAccount.MonarchyStatus.commoner, BankAccount.KindOfFolk.good));
    bankAccounts.add(new BankAccount("Simba", 2000.337, "lion", BankAccount.MonarchyStatus.royal,
        BankAccount.KindOfFolk.good));
    bankAccounts.add(new BankAccount("Zazu", 478.12, "red-billed hornbill",
        BankAccount.MonarchyStatus.commoner, BankAccount.KindOfFolk.good));
    bankAccounts.add(new BankAccount("Banzai", -677.65, "hyena",
        BankAccount.MonarchyStatus.commoner, BankAccount.KindOfFolk.bad));
    bankAccounts.add(new BankAccount("Scar", 560049000.98, "lion",
        BankAccount.MonarchyStatus.commoner, BankAccount.KindOfFolk.bad));
  }

  @GetMapping("/show")
  public String showDetails(Model model) {
    BankAccount account = new BankAccount("Simba", 2000, "lion", BankAccount.MonarchyStatus.royal, BankAccount.KindOfFolk.good);
    model.addAttribute("simba", account);
    return "index";
  }

  @GetMapping("/htmlception")
  public String displayText(Model model) {
    String stringToDisplay = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("text", stringToDisplay);
    return "htmlception";
  }

  @GetMapping("/accounts")
  public String showAccounts(Model model) {
    model.addAttribute("accounts", bankAccounts);

    return "accounts";
  }
}