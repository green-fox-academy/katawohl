package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import com.greenfoxacademy.webshop.models.ShopItemList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  List<ShopItem> shopItems = new ArrayList<>();

  public MainController() {
    shopItems.add(new ShopItem("Garden Gnome", "Funny and pretty friend for the garden",
        222, 4));
    shopItems.add(new ShopItem("Garden Hose", "The perfect tool to water your garden friend"
        , 11.4, 6));
    shopItems.add(new ShopItem("Solar Lantern", "Light up the dark nights in the garden", 17.3
        , 11));
    shopItems.add(new ShopItem("Bird Bath", "Give water for the chirpy visitors of the garden",
        37.9, 0));
  }

  @GetMapping(value = "main")
  public String getIndex(Model model) {
    model.addAttribute("items", shopItems);
    return "index";
  }

  @GetMapping(value = "only-available")
  public String getAvailable(Model model) {
    List<ShopItem> availableItems = shopItems.stream()
        .filter(item -> item.getQuantityOfStock() != 0)
        .collect(Collectors.toList());
    model.addAttribute("items", availableItems);
    return "index";
  }

  @GetMapping(value = "cheapest-first")
  public String orderCheapest(Model model) {
    List<ShopItem> cheapestOrder = shopItems.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("items", cheapestOrder);
    return "index";
  }
}

