import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the uppercase characters in a string!

    String string = "string";

    char[] charactersOfString = string.toCharArray();

    List<Character> listC = new ArrayList<Character>();
    for (char c : charactersOfString) {
      listC.add(c);
    }

    listC.stream()
        .map(Character::toUpperCase)
        .forEach(System.out::println);
  }
}
