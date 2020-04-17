package com.greenfoxacademy.webshop.models;

import java.text.NumberFormat;
import java.util.Locale;

public class ShopItem {
  private String name;
  private String description;
  private double  price;
  private int quantityOfStock;

  public ShopItem(String name, String description, double price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String displayPrice() {
    String priceAsCurrency = NumberFormat.getCurrencyInstance(new Locale("de", "AT"))
        .format(this.price);
    return priceAsCurrency;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
