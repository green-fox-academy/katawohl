package com.greenfoxacdemy.di;

import com.greenfoxacdemy.di.helloworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {
  private Printer printer;

  @Autowired
  public DiApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
  }
}
