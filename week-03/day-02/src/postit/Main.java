/*Create a PostIt class that has
    a backgroundColor
    a text on it
    a textColor
    Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"*/

package postit;

import java.awt.Color;

public class Main {

  public static void main(String[] args) {
    PostIt post1 = new PostIt(Color.ORANGE, "Idea 1", Color.BLUE);
    PostIt post2 = new PostIt(Color.PINK, "Awesome", Color.BLACK);
    PostIt post3 = new PostIt(Color.YELLOW, "Superb!", Color.GREEN);
  }
}
