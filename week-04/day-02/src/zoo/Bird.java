package zoo;

import vehicle.Flyable;

public class Bird extends Animal implements Flyable {

  public Bird(String name) {
    super(name);
  }

  @Override
  public String breed() {
     return "laying eggs";
  }

  @Override
  public void takeOff() {
    System.out.println("Bird is almost flying");
  }

  @Override
  public void fly() {
    System.out.println("Bird is flying");
  }

  @Override
  public void land() {
    System.out.println("Bird is landing");
  }
}
