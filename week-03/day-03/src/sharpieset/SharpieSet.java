package sharpieset;

/*Create SharpieSet class
it contains a list of Sharpie
        countUsable() -> sharpie is usable if it has ink in it
    removeTrash() -> removes all unusable sharpies*/

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  public static void main(String[] args) {

    List<Sharpie> mySharpies = new ArrayList<>();

    mySharpies.add(new Sharpie("blue", 11, 200));
    mySharpies.add(new Sharpie("yellow", 3, 0));
    mySharpies.add(new Sharpie("green", 8, 20));
    mySharpies.add(new Sharpie("pink", 12, 0));
    mySharpies.add(new Sharpie("orange", 5, 40));

    System.out.println(countUsable(mySharpies));

    removeTrash(mySharpies);

  }

  public static int countUsable(List<Sharpie> sharpieList) {
    int counter = 0;
    for (Sharpie sharpie : sharpieList) {
      if (sharpie.inkAmount != 0) {
        counter++;
      }
    }
    return counter;
  }

  public static void removeTrash(List<Sharpie> sharpieList) {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (sharpieList.get(i).inkAmount == 0) {
        sharpieList.remove(sharpieList.get(i));
      }
    }

  }

}

