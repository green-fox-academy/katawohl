package com.greenfoxacademy.exercises.models;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;

  public BankAccount(String name, double balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
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

  public boolean ifIsKing() {
    return isKing;
  }

  public String getAnimalType() {
    return animalType;
  }
}
