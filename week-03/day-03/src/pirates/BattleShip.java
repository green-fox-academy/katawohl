package pirates;

import java.util.ArrayList;
import java.util.List;

/*Create a BattleApp class with a main method
    Create 2 ships, fill them with pirates
    Have a battle!*/
public class BattleShip {

  public static void main(String[] args) {
    Ship ship1 = new Ship();
    ship1.fillShip();

    Ship ship2 = new Ship();
    ship2.fillShip();

    boolean firstWins = ship1.battle(ship2);
    System.out.println((firstWins ? "First" : "Second") + " ship won the battle");

    ship1.displayShip();

    ship2.displayShip();

  }
}
