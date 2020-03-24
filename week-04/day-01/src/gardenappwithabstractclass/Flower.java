package gardenappwithabstractclass;

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
    if (waterLevel >= minimumWaterLevel) {
      System.out.println("I am the " + this.flowerColor + " Flower, and I am feeling awesome! My " +
          "water level is " + waterLevel);
    } else {
      System.out.println("I am the " + this.flowerColor + " Flower, and I need water now! My " +
          "water level is " + waterLevel);
    }
  }

  @Override
  public void dryOut() {
    System.out.println("Please, water me! I am the " + this.flowerColor + " Flower, and I'm " +
        "thirsty!");
  }

  @Override
  public void getsWater(int amountOfWater) {
    if (waterLevel < minimumWaterLevel) {
      waterLevel += amountOfWater * 0.75f;
    } else {
      System.out.println("I am the " + this.flowerColor + " Flower, and I have enough water, " +
          "thank you!");
    }
  }

}
