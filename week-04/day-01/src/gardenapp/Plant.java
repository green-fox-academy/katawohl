package gardenapp;

public class Plant {
  private int waterLevel;
  private int minimumWaterLevel;

  public void getsSun() {
    this.waterLevel--;
    if (waterLevel < minimumWaterLevel) {
      dryOut();
    } else {
      System.out.println("I'm enjoying the sun!");
    }
  }

  public void dryOut() {
    System.out.println("Please, water me!");
  }

  public void displayWaterLevel() {
    System.out.println("My water level is " + waterLevel + ". If my water level is below " + minimumWaterLevel + ", please water me.");
  }

  public void getsWater(int amountOfWater) {
    if (this.waterLevel < minimumWaterLevel) {
      this.waterLevel += amountOfWater * 0.5f;
    } else {
      System.out.println("I have enough water, thank you!");
    }
  }

  public Plant() {
    this.waterLevel = 3;
    this.minimumWaterLevel = 5;
  }

  public Plant(int waterLevel, int minimumWaterLevel) {
    this.waterLevel = waterLevel;
    this.minimumWaterLevel = minimumWaterLevel;
  }

  public int getWaterLevel() {
    return waterLevel;
  }

  public void setWaterLevel(int waterLevel) {
    this.waterLevel = waterLevel;
  }

  public int getMinimumWaterLevel() {
    return minimumWaterLevel;
  }

  public void setMinimumWaterLevel(int minimumWaterLevel) {
    this.minimumWaterLevel = minimumWaterLevel;
  }
}
