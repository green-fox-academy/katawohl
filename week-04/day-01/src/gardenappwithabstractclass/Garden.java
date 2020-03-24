package gardenappwithabstractclass;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  String name;
  List<Plant> plants;

  public Garden(String name) {
    this.name = name;
    this.plants = new ArrayList<Plant>();
  }

  public void addFlower(Flower flower) {
    plants.add(flower);
  }

  public void addTree(Tree tree) {
    plants.add(tree);
  }

  public void info() {
    for (Plant plant : plants) {
      plant.displayWaterLevel();
    }
  }

  public void waterGarden(int amountOfWater) {
    System.out.println();
    System.out.println("Let's water the thirsty plants with " + amountOfWater + " water.");

    int thirstyPlantCounter = 0;

    List<Plant> thirstyPlants = new ArrayList<Plant>();

    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getWaterLevel() < plants.get(i).getMinimumWaterLevel()) {
        thirstyPlantCounter++;
        thirstyPlants.add(plants.get(i));
      } else {
        continue;
      }
    }

    int amountPerPlant = amountOfWater / thirstyPlantCounter;

    for (Plant plant : thirstyPlants) {
      plant.getsWater(amountPerPlant);
    }

  }
}
