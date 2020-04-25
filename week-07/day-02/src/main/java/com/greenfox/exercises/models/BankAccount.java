package com.greenfox.exercises.models;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private MonarchyStatus monarchyStatus;
  private KindOfFolk kindOfFolk;

  public BankAccount(String name, double balance, String animalType,
                     MonarchyStatus monarchyStatus, KindOfFolk kindOfFolk) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.monarchyStatus = monarchyStatus;
    this.kindOfFolk = kindOfFolk;
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

  public MonarchyStatus getMonarchyStatus() {
    return monarchyStatus;
  }

  public String getAnimalType() {
    return animalType;
  }

  public KindOfFolk getKindOfFolk() {
    return kindOfFolk;
  }

  public enum MonarchyStatus{
    royal,
    commoner
  }

  public enum KindOfFolk{
    bad,
    good
  }
}
