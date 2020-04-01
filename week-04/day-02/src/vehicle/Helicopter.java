package vehicle;

public class Helicopter extends Vehicle implements Flyable{

  public Helicopter(String name) {
    super(name);
  }

  @Override
  public void takeOff() {
    System.out.println("Helicopter has started to ascend");
  }

  @Override
  public void fly() {
    System.out.println("Helicopter is flying");
  }

  @Override
  public void land() {
    System.out.println("Helicopter is landing");
  }
}
