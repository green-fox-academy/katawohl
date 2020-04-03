import comparable.Thing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThingsCompare {
  public static void main(String[] args) {

    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing("Remove obstacles");
    Thing stand = new Thing("Stand up");
    Thing lunch = new Thing("Eat lunch");

    List<Thing> things = new ArrayList<>(Arrays.asList(milk, obstacles,stand,lunch));

    Collections.sort(things);

    System.out.println(Arrays.toString(things.toArray()));

    stand.complete();
    lunch.complete();

    Collections.sort(things);

    System.out.println(Arrays.toString(things.toArray()));
  }
}
