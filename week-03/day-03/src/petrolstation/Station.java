package petrolstation;

public class Station {
  int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void refill(Car car){
    gasAmount -= car.capacity;
  }
}
