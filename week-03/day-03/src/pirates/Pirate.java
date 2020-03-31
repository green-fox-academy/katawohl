package pirates;

/*
Create a Pirate class. While you can add other fields and methods, you must have these methods:-

    drinkSomeRum() - intoxicates the Pirate some
    howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
    0 to 4 times, "Pour me anudder!"
    else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
    If you manage to get this far, then you can try to do the following.

    die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
    brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a
    1/3 chance, 1 dies, the other dies or they both pass out.
    And... if you get that far...

    Add a parrot.
*/

import java.util.Random;

public class Pirate {
  private int intoxLevel;
  private boolean isDead;
  private boolean isPassedOut;

  public Pirate() {
    this.intoxLevel = 0;
    this.isDead = false;
    this.isPassedOut = false;
  }

  public Pirate(int intoxLevel) {
    this.intoxLevel = intoxLevel;
    this.isDead = false;
    this.isPassedOut = false;
  }

  public void drinkSomeRum() {
    if (this.isDead) {
      System.out.println("He's dead :(");
    } else {
      this.intoxLevel++;
    }
  }

  public void passOutAndSleep() {
    if (this.isDead) {
      System.out.println("He's dead :(");
    } else {
      this.intoxLevel = 0;
      this.isPassedOut = false;
      System.out.println("Night-night");
    }
  }

  public void howsItGoingMate() {
    if (this.intoxLevel < 4 && !this.isDead) {
      drinkSomeRum();
      System.out.println("Pour me anudder!");
    } else if (!this.isDead) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      isPassedOut = true;
    } else {
      System.out.println("He's dead :(");
    }
  }

  public void die() {
    this.isDead = true;
  }

  public void brawl(Pirate enemy) {
    if (this.isDead) {
      System.out.println("The dead can't fight");
    } else {
      if (enemy.isDead) {
        System.out.println("You can't fight him, he's dead :(");
      } else {
        Random random = new Random();
        int chance = random.nextInt(3);

        if (chance == 1) {
          die();
          System.out.println("You dead, hah!");
        }
        if (chance == 2) {
          enemy.die();
          System.out.println("Killed the bastard!");
        }
        if (chance == 3) {
          enemy.passOutAndSleep();
          passOutAndSleep();
          System.out.println("Time to sleep you two!");
        }
      }
    }
  }

  public int getIntoxLevel() {
    return intoxLevel;
  }

  public boolean isDead() {
    return isDead;
  }

  public boolean isPassedOut() {
    return isPassedOut;
  }

  public void setDead(boolean dead) {
    isDead = dead;
  }
}
