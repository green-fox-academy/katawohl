package gardenapp;

public class Flower extends Plant {
  private FlowerColor flowerColor;

  public enum FlowerColor {
    yellow,
    blue
  }

  public Flower() {
    super(3, 5);
    this.flowerColor = FlowerColor.yellow;
  }


  public Flower(int waterLevel, FlowerColor flowerColor) {
    super(waterLevel, 5);
    this.flowerColor = flowerColor;
  }

  @Override
  public void displayWaterLevel() {
    if (super.getWaterLevel() >= super.getMinimumWaterLevel()) {
      System.out.println("I am the " + this.flowerColor + " Flower, and I am feeling awesome!");
    } else {
      System.out.println("I am the " + this.flowerColor + " Flower, and I need water now!");
    }
  }

  @Override
  public void dryOut() {
    System.out.println("Please, water me! I am the " + this.flowerColor + " Flower, and I'm " +
        "thirsty!");
  }

  @Override
  public void getsWater(int amountOfWater) {
    int flowerWaterLevel = super.getWaterLevel();
    int flowerMinimumWater = super.getMinimumWaterLevel();

    if (flowerWaterLevel < flowerMinimumWater) {
      super.setWaterLevel(flowerWaterLevel += amountOfWater * 0.75f);
    } else {
      System.out.println("I am the " + this.flowerColor + " Flower, and I have enough water, " +
          "thank you!");
    }
  }

}
