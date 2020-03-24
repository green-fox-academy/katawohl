package main.java.music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;

  public StringedInstrument(){

  }

  public StringedInstrument(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }


  public abstract String sound();

}
