package fleetofthings;

public class FleetOfThings {

  public static void main(String[] args) {

    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Fleet fleet = new Fleet();

    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing("Remove obstacles");
    Thing stand = new Thing("Stand up");
    Thing lunch = new Thing("Eat lunch");

    fleet.add(milk);
    fleet.add(obstacles);
    fleet.add(stand);
    fleet.add(lunch);

    stand.complete();
    lunch.complete();

    System.out.println(fleet);
  }
}