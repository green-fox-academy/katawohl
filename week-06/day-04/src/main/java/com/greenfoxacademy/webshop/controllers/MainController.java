package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  List<ShopItem> shopItems = new ArrayList<>();

  public MainController() {
    shopItems.add(new ShopItem("Garden Gnome", "Funny and pretty friend for the garden",
        222, 4));
    shopItems.add(new ShopItem("Garden Hose", "The perfect tool to water your garden gnome"
        , 11.4, 6));
    shopItems.add(new ShopItem("Solar Lantern", "Light up the dark nights in the garden", 17.3
        , 11));
    shopItems.add(new ShopItem("Bird Bath", "Give water for the chirpy visitors of the garden",
        37.9, 0));
  }

  @GetMapping("main")
  public String getIndex(Model model) {
    model.addAttribute("items", shopItems);
    return "index";
  }

  @GetMapping("only-available")
  public String getAvailable(Model model) {
    List<ShopItem> availableItems = shopItems.stream()
        .filter(item -> item.getQuantityOfStock() != 0)
        .collect(Collectors.toList());
    model.addAttribute("items", availableItems);
    return "index";
  }

  @GetMapping("cheapest-first")
  public String orderCheapest(Model model) {
    List<ShopItem> cheapestOrder = shopItems.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());
    model.addAttribute("items", cheapestOrder);
    return "index";
  }

  @GetMapping("gnome")
  public String giveGnome(Model model) {
    List<ShopItem> containsGnome = shopItems.stream()
        .filter(shopItem -> shopItem.getName().toLowerCase().contains("gnome") || shopItem.getDescription().toLowerCase().contains("gnome"))
        .collect(Collectors.toList());
    model.addAttribute("items", containsGnome);
    return "index";
  }

  @GetMapping("stock")
  public String giveAverageStock(Model model) {
    OptionalDouble averagePrice = shopItems.stream()
        .mapToDouble(ShopItem::getQuantityOfStock)
        .average();

    String averageToDisplay;

    if (averagePrice.isPresent()){
      averageToDisplay = "Average stock: " + averagePrice;
    } else {
      averageToDisplay = "No item available";
    }

    model.addAttribute("stringToDisplay", averageToDisplay);
    return "stock";
  }

  @GetMapping("most-expensive")
  public String giveMostExpensive(Model model) {
    Optional<String> mostExpensiveName = shopItems.stream()
        .max(Comparator.comparingDouble(ShopItem::getPrice))
        .map(ShopItem::getName);

    String mostExpensive;

    if (mostExpensiveName.isPresent()){
      mostExpensive = "The most expensive item is : " + mostExpensiveName;
    } else {
      mostExpensive = "No item available";
    }

    model.addAttribute("stringToDisplay", mostExpensive);
    return "stock";
  }

  @PostMapping("/search")
  public String filterBySearchTerm(@RequestParam(name = "searchTerm") String searchTerm,
                                   Model model) {
    List<ShopItem> searchResult = shopItems.stream()
        .filter(shopItem -> shopItem.getName().toLowerCase().contains(searchTerm.toLowerCase()) || shopItem.getDescription().toLowerCase().contains(searchTerm.toLowerCase()))
        .collect(Collectors.toList());
    model.addAttribute("items", searchResult);
    return "index";
  }

}

