package gardenapp;

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


  public Tree(int waterLevel,  TreeColor treeColor) {
    super(waterLevel, 10);
    this.treeColor = treeColor;
  }
  @Override
  public void displayWaterLevel() {
    if (super.getWaterLevel() >= super.getMinimumWaterLevel()) {
      System.out.println("I am the " + this.treeColor + " Tree, and I am feeling awesome!");
    } else {
      System.out.println("I am the " + this.treeColor + " Tree, and I need water now!");
    }
  }

  @Override
  public void dryOut() {
    System.out.println("Please, water me! I am the " + this.treeColor + " Tree, and I'm thirsty !");
  }

  @Override
  public void getsWater(int amountOfWater) {
    int treeWaterLevel = super.getWaterLevel();
    int treeMinimumWater = super.getMinimumWaterLevel();

    if (treeWaterLevel < treeMinimumWater) {
      super.setWaterLevel(treeWaterLevel += amountOfWater * 0.4f);
    } else {
      System.out.println("I am the " + this.treeColor + " Tree, and I have enough water, thank " +
          "you !");
    }
  }

}
