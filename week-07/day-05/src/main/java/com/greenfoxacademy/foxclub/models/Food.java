package com.greenfoxacademy.foxclub.models;

import java.util.stream.Stream;

public enum Food {
  bread("bread"),
  tomatoSoup("tomato soup"),
  hamSandwich("ham sandwich"),
  friedChicken("fried chicken"),
  lambChops("lamb chops");
  private String name;

  Food(String name) {
    this.name = name;
  }

  public String getFoodName() {
    return this.name;
  }
}
