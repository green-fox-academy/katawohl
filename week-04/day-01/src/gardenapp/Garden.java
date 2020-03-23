package gardenapp;

import greenfoxinheritance.Mentor;
import greenfoxinheritance.Student;
import java.util.ArrayList;
import java.util.List;

public class Garden {
  String name;
  List<Flower> flowers;
  List<Tree> trees;

  public Garden(String name) {
    this.name = name;
    this.flowers = new ArrayList<Flower>();
    this.trees = new ArrayList<Tree>();
  }

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addTree(Tree tree) {
    trees.add(tree);
  }

  public void info() {
    for (Flower flower : flowers) {
      flower.displayWaterLevel();
    }
    for (Tree tree : trees) {
      tree.displayWaterLevel();
    }
  }

  public void waterGarden(int amountOfWater) {
    int thirstyFlowerCounter = 0;

    int thirstyTreeCounter = 0;

    List<Flower> thirstyFlowers = new ArrayList<Flower>();
    List<Tree> thirstyTrees = new ArrayList<Tree>();

    for (int i = 0; i < flowers.size(); i++) {
      if (flowers.get(i).getWaterLevel() < flowers.get(i).getMinimumWaterLevel()) {
        thirstyFlowerCounter++;
        thirstyFlowers.add(flowers.get(i));
      } else {
        continue;
      }
    }
    for (int i = 0; i < trees.size(); i++) {
      if (trees.get(i).getWaterLevel() < trees.get(i).getMinimumWaterLevel()) {
        thirstyTreeCounter++;
        thirstyTrees.add(trees.get(i));
      } else {
        continue;
      }
    }

    int amountPerPlant = amountOfWater / (thirstyFlowerCounter + thirstyTreeCounter);

    for (Flower flower : thirstyFlowers) {
      flower.getsWater(amountPerPlant);
    }

    for (Tree tree : thirstyTrees) {
      tree.getsWater(amountPerPlant);
    }
  }
}
