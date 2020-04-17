package com.greenfoxacademy.webshop.models;

import java.util.ArrayList;
import java.util.List;

public class ShopItemList{
  private List<ShopItem> shopItemList = new ArrayList<>();

  public void addShopItem(ShopItem shopItem) {
    shopItemList.add(shopItem);
  }

  //instantiate a shop item list in the controller
}
