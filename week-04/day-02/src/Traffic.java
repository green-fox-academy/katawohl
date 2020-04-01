import vehicle.Helicopter;

public class Traffic {

  public static void main(String[] args) {
    Helicopter heli = new Helicopter("Copi");

    heli.takeOff();
    heli.fly();
    heli.land();
  }
}
