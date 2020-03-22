package pirates;

public class Main {
  public static void main(String[] args) {
    Pirates piri1 = new Pirates();
    Pirates piri2 = new Pirates();
    Pirates piri3 = new Pirates();
    Pirates piri4 = new Pirates();
    Pirates piri5 = new Pirates();

    piri1.drinkSomeRum();
    System.out.println(piri1.intoxLevel);
    piri1.howsItGoingMate();
    System.out.println(piri1.intoxLevel);
    piri1.howsItGoingMate();
    System.out.println(piri1.intoxLevel);
    piri1.howsItGoingMate();
    System.out.println(piri1.intoxLevel);
    piri1.howsItGoingMate();
    System.out.println(piri1.intoxLevel);

    piri5.die();

    piri5.drinkSomeRum();

    piri5.howsItGoingMate();

    piri3.brawl(piri1);

    piri4.brawl(piri2);

  }
}
