package pirates;

import java.util.ArrayList;
import java.util.List;

/*Create a BattleApp class with a main method
    Create 2 ships, fill them with pirates
    Have a battle!*/
public class BattleShip {

  public static void main(String[] args) {
    Ship ship1 = new Ship("Rosita");
    Ship ship2 = new Ship("Juanita");

    Pirates captain1 = new Pirates(3);
    Pirates captain2 = new Pirates(4);

    ship1.fillShip(captain1);
    ship2.fillShip(captain2);

    List<Pirates> crew1 = new ArrayList<>();

    crew1.add(new Pirates(1));
    crew1.add(new Pirates(9));
    crew1.add(new Pirates());
    crew1.add(new Pirates(5));
    crew1.add(new Pirates(3));

    ship1.fillShip(crew1);

    List<Pirates> crew2 = new ArrayList<>();
    crew2.add(new Pirates(6));
    crew2.add(new Pirates(2));
    crew2.add(new Pirates(1));
    crew2.add(new Pirates(4));
    crew2.add(new Pirates());
    crew2.add(new Pirates(8));

    ship2.fillShip(crew2);

    ship1.displayShip();

    ship2.displayShip();

    ship1.battle(ship2);

    ship1.displayShip();

    ship2.displayShip();
  }
}
