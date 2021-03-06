package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Drink;
import com.greenfoxacademy.foxclub.models.Food;
import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.Trick;
import com.greenfoxacademy.foxclub.service.FoxService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String enterName(@RequestParam String name, Model model) {
    return "redirect:/?name=" + name;
  }

  @GetMapping("/")
  public String showMain(@RequestParam String name, Model model) {
    Fox fox = new Fox(name);
    foxService.addFox(fox);
    model.addAttribute("foxName", fox.getName());
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
    model.addAttribute("numOfTricks", fox.getTricks().size());
    model.addAttribute("listOfTricks", fox.getTricks());
    return "index";
  }

  @GetMapping("/nutritionStore")
  public String showNutrition(@RequestParam String name, Model model) {
    List<Food> foodList = Arrays.asList(Food.values());
    List<Drink> drinkList = Arrays.asList(Drink.values());

    model.addAttribute("foxName", foxService.getFoxByName(name).getName());
    model.addAttribute("foods", foodList);
    model.addAttribute("drinks", drinkList);
    return "nutrition";
  }

  @PostMapping("/updateNutrition")
  public String updateNutrition(@RequestParam String name, @RequestParam Food food,
                                @RequestParam Drink drink) {
    Fox fox = foxService.getFoxByName(name);
    fox.setFood(food);
    fox.setDrink(drink);

    return "redirect:/" + name + "info";
  }

  @GetMapping("/{name}info")
  public String showFoxInfo(@PathVariable String name, Model model) {
    Fox fox = foxService.getFoxByName(name);

    model.addAttribute("foxName", fox.getName());
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
    model.addAttribute("numOfTricks", fox.getTricks().size());
    model.addAttribute("listOfTricks", fox.getTricks());
    return "index";
  }

  @GetMapping("/trickcenter")
  public String showTrickCenter(@RequestParam String name, Model model){
    List<Trick> trickList = Arrays.asList(Trick.values());

    List<Trick> foxTricks = new ArrayList<>();
    for (Trick trick : trickList) {
      if (!foxService.getFoxByName(name).getTricks().contains(trick)){
        foxTricks.add(trick);
      }
    }

    model.addAttribute("foxName", foxService.getFoxByName(name).getName());
    model.addAttribute("trickList", foxTricks);
    return "trickcenter";
  }

  @PostMapping("/updateTrick")
  public String updateNutrition(@RequestParam String name, @RequestParam Trick trick) {
    Fox fox = foxService.getFoxByName(name);
    fox.addTrick(trick);

    return "redirect:/" + name + "info";
  }
}
