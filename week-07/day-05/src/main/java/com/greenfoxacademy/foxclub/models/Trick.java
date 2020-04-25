package com.greenfoxacademy.foxclub.models;

public enum Trick {
  blowGum("blow gum"),
  whistle("whistle"),
  learnVulcanSalute("learn the Vulcan salute"),
  knit("knit a hat"),
  bakeBabka("bake Babka"),
  talkBackwards("talk backwards");
  private String name;

  Trick(String name) {
    this.name = name;
  }

  public String getTrickName(){
    return this.name;
  }
}
