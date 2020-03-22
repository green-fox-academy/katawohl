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

import java.util.List;

public class Ship {
  String name;
  Pirates captain;
  List<Pirates> crew;

  public Ship(String name) {
    this.name = name;
  }

  public void fillShip(Pirates captain) {
    this.captain = captain;
  }

  public void fillShip(List<Pirates> crew) {
    this.crew = crew;
  }

  public int shipCrewNum() {
    int numOfCrew = 0;
    for (Pirates pirate : this.crew) {
      if (pirate.isDead == Pirates.IsDead.alive) {
        numOfCrew++;
      } else {
        continue;
      }
    }
    return numOfCrew;
  }

  public void displayShip() {
    if (captain.isDead != Pirates.IsDead.dead) {
      System.out.println("The captain of the ship " + this.name + " consumed " + captain.intoxLevel + " glasses of rum. He is " +
          "currently " + captain.ifPassedOut + ".");
    } else {
      System.out.println("The captain of the ship " + this.name + " is unfortunately dead. R.I.P" +
          ".," +
          " Captain!");
    }

    System.out.println("The number of alive crew on " + this.name + " is " + this.shipCrewNum() +
        ".");
  }

  public void party() {
    for (int i = 0; i < (int) (Math.random() * (10)); i++) {
      captain.intoxLevel++;
      for (Pirates pirate : crew) {
        pirate.intoxLevel++;
      }
    }
  }

  public void randomCrewDeath() {
    for (int i = 0; i < (int) (Math.random() * crew.size()); i++) {
      crew.get(i).die();
    }
  }

  public boolean battle(Ship ship) {

    int scoreThisShip;
    int scoreEnemy;

    scoreThisShip = this.shipCrewNum() + this.captain.intoxLevel;
    scoreEnemy = ship.shipCrewNum() + ship.captain.intoxLevel;

    if (scoreThisShip >= scoreEnemy) {
      this.party();
      ship.randomCrewDeath();
      System.out.println("The enemy is destroyed!");
      System.out.println(this.name + " won!");
      return true;
    } else {
      ship.party();
      this.randomCrewDeath();
      System.out.println("Uh-oh, we're screwed!");
      System.out.println(ship.name + " won!");
      return false;
    }
  }
}
