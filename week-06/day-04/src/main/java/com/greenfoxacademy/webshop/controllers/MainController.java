package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import com.greenfoxacademy.webshop.models.ShopItemList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  List<ShopItem> shopItems = new ArrayList<>();

  public MainController(){
    shopItems.add(new ShopItem("Garden Gnome", "Funny and pretty friend for the garden",
        222, 4));
    shopItems.add(new ShopItem("Garden Hose", "The perfect tool to water your garden gnome"
        , 11.4, 6));
    shopItems.add(new ShopItem("Solar Lantern", "To light up your garden gnomes dark " +
        "nights", 17.3, 11));
    shopItems.add(new ShopItem("Bird Bath", "Give some water for your garden gnome's best " +
        "friends", 37.9, 2));
  }

  @GetMapping(value = "main")
  public String getIndex(Model model) {
    model.addAttribute("items", shopItems);
    return "index";
  }

  @GetMapping(value = "available")
  public String getAvailable(){
    return "jf";
  }
}

