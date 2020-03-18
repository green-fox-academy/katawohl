package sharpieset;

public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie (String color, float width, float inkAmount){
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public void use(){
    inkAmount--;
  }
}
