package com.greenfoxacademy.webshop.models;

import java.text.NumberFormat;
import java.util.Locale;

public class ShopItem {
  protected  String name;
  protected  String description;
  protected  double  price;
  protected  int quantityOfStock;

  public ShopItem(String name, String description, double price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public  String displayPrice() {
    String priceAsCurrency = NumberFormat.getCurrencyInstance(new Locale("de", "AT"))
        .format(this.price);
    return priceAsCurrency;
  }

}
