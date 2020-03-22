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

public class Pirates {
  int intoxLevel;
  IsDead isDead;
  PassedOut passedOut;
  HasParrot hasParrot;

  public enum IsDead{
    dead,
    alive
  }

  public enum PassedOut{
    passedOut,
    awake
  }

  public enum HasParrot{
    hasParrot,
    parrotless
  }

  public Pirates() {
    this.intoxLevel = 0;
    this.isDead = IsDead.alive;
    this.passedOut = PassedOut.awake;
    this.hasParrot = HasParrot.parrotless;
  }

  public Pirates(int intoxLevel) {
    this.intoxLevel = intoxLevel;
    this.isDead = IsDead.alive;
    this.passedOut = PassedOut.awake;
  }

  public Pirates(boolean hasParrot) {
    this.intoxLevel = 0;
    this.isDead = IsDead.alive;
    this.hasParrot = HasParrot.hasParrot;
    this.passedOut = PassedOut.awake;
  }

  public void drinkSomeRum() {
    if (this.isDead == IsDead.dead) {
      System.out.println("He's dead :(");
    } else {
      this.intoxLevel += 1;
    }
  }

  public void passOutAndSleep() {
    this.intoxLevel = 0;
    this.passedOut = PassedOut.passedOut;
    System.out.println("Night-night");
  }

  public void wakeUp() {
    if (this.passedOut == PassedOut.passedOut) {
      passedOut = PassedOut.awake;
    } else {
      System.out.println("I'm awake as a pirate!");
    }
  }

  public void howsItGoingMate() {
    if (this.intoxLevel < 4 & this.isDead != IsDead.dead) {
      drinkSomeRum();
      System.out.println("Pour me anudder!");
    } else if (this.isDead != IsDead.dead) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      passOutAndSleep();
    } else {
      System.out.println("He's dead :(");
    }
  }

  public void die() {
    this.intoxLevel = 0;
    this.isDead = IsDead.dead;
  }

  public void brawl(Pirates pirate) {
    if (this.isDead == IsDead.dead) {
      System.out.println("The dead can't fight");
    } else {
      if (pirate.isDead == IsDead.dead) {
        System.out.println("You can't fight him, he's dead :(");
      } else {
        int random = (int) (Math.random() * (3)) + 1;
        if (random == 1) {
          die();
          System.out.println("You dead, hah!");
        }
        if (random == 2) {
          pirate.die();
          System.out.println("Killed the bastard!");
        }
        if (random == 3) {
          pirate.passOutAndSleep();
          passOutAndSleep();
          System.out.println("Time to sleep you two!");
        }
      }
    }
  }

}
