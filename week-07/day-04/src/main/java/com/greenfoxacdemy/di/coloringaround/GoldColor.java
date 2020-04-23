package com.greenfoxacdemy.di.coloringaround;

import com.greenfoxacdemy.di.helloworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoldColor implements MyColor{

  private Printer printer;

  @Autowired
  public GoldColor(Printer printer){

    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("gold");
  }
}
