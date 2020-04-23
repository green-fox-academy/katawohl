package com.greenfoxacdemy.di.coloringaround;

import org.springframework.stereotype.Service;


public class GoldColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("It is gold in color...");
  }
}
