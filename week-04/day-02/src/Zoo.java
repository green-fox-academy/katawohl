import zoo.Bird;
import zoo.Mammal;
import zoo.Reptile;

public class Zoo {

  public static void main(String[] args) {
    Mammal elephant = new Mammal("Kiki");
    Bird parrot = new Bird("Thelma");
    Reptile snake = new Reptile("Fritz");

    System.out.println("How do you breed?");
    System.out.println(snake.getName() + " is breeding by " + snake.breed());
    System.out.println(elephant.getName() + " is breeding by " + elephant.breed());
    System.out.println(parrot.getName() + " is breeding by " + parrot.breed());
  }
}
