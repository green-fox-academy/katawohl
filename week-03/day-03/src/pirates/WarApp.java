package pirates;

import java.util.Random;

public class WarApp {
  public static void main(String[] args) {
    Random random = new Random();
    Armada armada1 = new Armada();
    Armada armada2 = new Armada();

    int totalShips = random.nextInt(9) + 1;

    for (int i = 0; i < totalShips; i++) {
      Ship ship = new Ship();
      ship.fillShip();

      boolean toFirstArmada = random.nextBoolean();

      if (toFirstArmada) {
        armada1.addShip(ship);
      } else {
        armada2.addShip(ship);
      }
    }

    boolean firstWins = armada1.war(armada2);
    System.out.println("The " + (firstWins ? "first" : "second") + " armada won the battle");
  }
}
