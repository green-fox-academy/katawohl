package animals;

public class Main {

  public static void main(String[] args) {
    Animal teckel = new Animal();

    teckel.drink();
    teckel.play();
    teckel.eat();

    teckel.play();
    teckel.eat();
    teckel.play();

    System.out.println((teckel.hunger)  + " and " + (teckel.thirst));
  }
}
