package doableHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<String[]> trees = new ArrayList<>();

    String[] Pine = {"Pine", "Deep Dark Green", "300", "Female"};
    String[] Lemon = {"Lemon", "Pesky Green", "3", "Male"};
    String[] Sycamore = {"Sycamore", "Brownish Pale Green", "53", "Male"};
    String[] Sandalwood = {"Sandalwood", "Pale Green", "25", "Female"};
    String[] Baobab = {"Baobab", "Greyish Green", "768", "Female"};

    trees.add(0, Pine);
    trees.add(1, Lemon);
    trees.add(2, Sycamore);
    trees.add(3, Sandalwood);
    trees.add(4, Baobab);

    for(String[] array : trees) {
      System.out.println(Arrays.toString(array));
    }
  }
}
