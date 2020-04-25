package com.greenfoxacademy.foxclub.models;

public enum Drink {
  water("water"),
  coke("coke"),
  mintLemonade("mint lemonade"),
  gingerJuice("ginger juice");
  private String name;

  Drink(String name) {
    this.name = name;
  }

  public String getDrinkName() {
    return this.name;
  }

}
