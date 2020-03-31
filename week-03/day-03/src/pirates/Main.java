package pirates;

public class Main {
  public static void main(String[] args) {
    Pirate piri1 = new Pirate();
    Pirate piri2 = new Pirate();
    Pirate piri3 = new Pirate();
    Pirate piri4 = new Pirate();
    Pirate piri5 = new Pirate();

    piri1.drinkSomeRum();
    System.out.println(piri1.getIntoxLevel());
    piri1.howsItGoingMate();
    System.out.println(piri1.getIntoxLevel());
    piri1.howsItGoingMate();
    System.out.println(piri1.getIntoxLevel());
    piri1.howsItGoingMate();
    System.out.println(piri1.getIntoxLevel());
    piri1.howsItGoingMate();
    System.out.println(piri1.getIntoxLevel());

    piri5.die();

    piri5.drinkSomeRum();

    piri5.howsItGoingMate();

    piri3.brawl(piri1);

    piri4.brawl(piri2);

  }
}
