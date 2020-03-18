package petrolstation;

public class Main {
  public static void main(String[] args) {
    Station bp = new Station(1000);
    Car vw = new Car();
    Car citroen = new Car();

    bp.refill(vw);

    System.out.println(bp.gasAmount);

    bp.refill(citroen);

    System.out.println(bp.gasAmount);
  }
}
