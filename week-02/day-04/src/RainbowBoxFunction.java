    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow,
      // green, blue,
    // indigo, violet).

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    int size = WIDTH*HEIGHT;

    Color[] colorArray = new Color[] {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
        Color.BLUE, new Color(75, 0,
        130), new Color(238, 130, 238)};

    Color color;

    for (int i = 0; i < colorArray.length; i++) {
      color = colorArray[i];
      size /= 2;
      RainbowBox(size, color, graphics);
    }
  }


  public static void RainbowBox(int size, Color color, Graphics graphics) {
    int x = (int) Math.sqrt(size);
    graphics.setColor(color);
    graphics.fillRect((WIDTH / 2) - (x / 2), (HEIGHT / 2) - (x / 2), x, x);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}