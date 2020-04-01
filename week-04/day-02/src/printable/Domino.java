package printable;

public class Domino implements Printable{
  private int sideA;
  private int sideB;

  public Domino(int sideA, int sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  @Override
  public void printAllFields() {
    System.out.println("Domino Side A: " + this.sideA + ", Side B: " + this.sideB);
  }
}
