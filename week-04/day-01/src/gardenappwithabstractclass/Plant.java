package gardenappwithabstractclass;

public abstract class Plant {
  protected int waterLevel;
  protected int minimumWaterLevel;

  public Plant(int waterLevel, int minimumWaterLevel) {
    this.waterLevel = waterLevel;
    this.minimumWaterLevel = minimumWaterLevel;
  }

  public void getsSun() {
    this.waterLevel--;
    if (waterLevel < minimumWaterLevel) {
      dryOut();
    } else {
      System.out.println("I'm enjoying the sun!");
    }
  }

  public abstract void dryOut();

  public abstract void displayWaterLevel();

  public abstract void getsWater(int amountOfWater);

  public int getWaterLevel() {
    return waterLevel;
  }

  public int getMinimumWaterLevel() {
    return minimumWaterLevel;
  }

}
