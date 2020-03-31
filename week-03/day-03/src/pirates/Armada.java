package pirates;

/*
Contains Ship-s as a list
    Have a armada.war(otherArmada) method where two armada can engage in war
    it should work like merge sort
    first ship from the first armada battles the first of the other
    the loser gets skipped so the next ship comes in play from that armada
    whichever armada gets to the end of its ships loses the war
    return true if this is the winner
*/

import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> ships = new ArrayList<>();

  public boolean war(Armada enemy){
    int indexOfThis = 0;
    int indexOfEnemy = 0;

    while (indexOfThis < ships.size() && indexOfEnemy < enemy.ships.size()){
      boolean thisWins = ships.get(indexOfThis).battle(enemy.ships.get(indexOfEnemy));
      if (thisWins){
        indexOfEnemy++;
      } else {
        indexOfThis++;
      }
    }

    return indexOfThis<indexOfEnemy;
  }

  public void addShip(Ship ship){
    ships.add(ship);
  }
}
