package com.greenfoxacademy.exercises.models;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public String displayBalance() {
    String priceAsCurrency = String.format("%.2f", balance) + " Zebra";
    return priceAsCurrency;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
