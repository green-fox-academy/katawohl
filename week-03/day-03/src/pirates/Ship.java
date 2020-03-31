package pirates;

/*The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
    When a ship is created it doesn't have a crew or a captain.
    The ship can be filled with pirates and a captain via fillShip() method.
    Filling the ship with a captain and random number of pirates.
    Ships should be represented in a nice way on command line including information about
    captains consumed rum, state (passed out / died)
    number of alive pirates in the crew
    Ships should have a method to battle other ships: ship.battle(otherShip)
    should return true if the actual ship (this) wins
    the ship should win if its calculated score is higher
    calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    The loser crew has a random number of losses (deaths).
    The winner captain and crew has a party, including a random number of rum :)*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  private List<Pirate> crew = new ArrayList<>();
  Random random = new Random();

  public void fillShip() {
    crew.add(new Captain());
    int piratesNumber = random.nextInt(10) + 1;

    for (int i = 0; i < piratesNumber; i++) {
      crew.add(new Pirate());
    }
  }

  public int shipCrewNum() {
    int numOfCrew = 0;
    for (Pirate pirate : this.crew) {
      if (!pirate.isDead()) {
        numOfCrew++;
      } else {
        continue;
      }
    }
    return numOfCrew;
  }

  public void displayShip() {
    Pirate captain = crew.get(0);

    if (!captain.isDead()) {
      System.out.println("The captain consumed " + captain.getIntoxLevel() + " glasses of rum. He" +
          " is " +
          "currently " + (captain.isPassedOut() ? "" : " not ") + "passed out");
    } else {
      System.out.println("The captain is unfortunately dead. R.I.P" +
          ".," +
          " Captain!");
    }

    System.out.println("The number of alive crew is " + this.shipCrewNum() +
        ".");
  }

  public void party() {
    int rums = random.nextInt(11);
    while (rums > 0) {
      for (Pirate pirate : crew) {
        if (!pirate.isDead()) {
          pirate.drinkSomeRum();
          rums--;
        }

        if (rums == 0) {
          break;
        }
      }
    }
  }

  public void randomCrewDeath() {
    int deaths = random.nextInt(crew.size());
    for (int i = 0; i < deaths; i++) {
      crew.get(i).die();
    }
  }

  public boolean battle(Ship enemy) {

    int scoreThisShip;
    int scoreEnemy;

    scoreThisShip = this.shipCrewNum() - this.crew.get(0).getIntoxLevel();
    scoreEnemy = enemy.shipCrewNum() - enemy.crew.get(0).getIntoxLevel();

    if (scoreThisShip >= scoreEnemy) {
      this.party();
      enemy.randomCrewDeath();
      System.out.println("The enemy is destroyed!");
      return true;
    } else {
      enemy.party();
      this.randomCrewDeath();
      System.out.println("Uh-oh, we're screwed!");
      return false;
    }
  }
}
