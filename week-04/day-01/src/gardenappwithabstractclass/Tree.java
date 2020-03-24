package gardenappwithabstractclass;

public class Tree extends Plant {
  private TreeColor treeColor;

  public enum TreeColor {
    purple,
    orange
  }

  public Tree() {
    super(2, 10);
    this.treeColor = TreeColor.orange;
  }


  public Tree(int waterLevel, TreeColor treeColor) {
    super(waterLevel, 10);
    this.treeColor = treeColor;
  }

  @Override
  public void displayWaterLevel() {
    if (waterLevel >= minimumWaterLevel) {
      System.out.println("I am the " + this.treeColor + " Tree, and I am feeling awesome! My " +
          "water level is " + waterLevel);
    } else {
      System.out.println("I am the " + this.treeColor + " Tree, and I need water now! My water " +
          "level is " + waterLevel);
    }
  }

  @Override
  public void dryOut() {
    System.out.println("Please, water me! I am the " + this.treeColor + " Tree, and I'm thirsty !");
  }

  @Override
  public void getsWater(int amountOfWater) {
    if (waterLevel < minimumWaterLevel) {
      waterLevel += amountOfWater * 0.4f;
    } else {
      System.out.println("I am the " + this.treeColor + " Tree, and I have enough water, thank " +
          "you !");
    }
  }

}
