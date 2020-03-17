package sharpie;

public class Main {
  public static void main(String[] args) {
    Sharpie greenSharpie = new Sharpie("green", (float) 6.8);
    Sharpie blueSharpie = new Sharpie("blue", 7);

    greenSharpie.use();
    greenSharpie.use();

    blueSharpie.use();

    System.out.println(blueSharpie.inkAmount + " and " + greenSharpie.inkAmount);
  }
}
