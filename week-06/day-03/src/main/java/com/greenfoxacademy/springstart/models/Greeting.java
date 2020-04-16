package com.greenfoxacademy.springstart.models;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  long greetCount;
  String content;

  public String getContent() {
    return content;
  }

  public long getGreetCount() {
    return greetCount;
  }

  public Greeting(long greetCount, String content) {
    this.greetCount = greetCount;
    this.content = content;
  }
}
