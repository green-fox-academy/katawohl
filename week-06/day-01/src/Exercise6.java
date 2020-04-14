import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
  public static void main(String[] args) {

    //Write a Stream Expression to find the uppercase characters in a string!

    String string = "sTrinG";

    char[] charactersOfString = string.toCharArray();

    List<Character> listC = new ArrayList<>();
    for (char c : charactersOfString) {
      listC.add(c);
    }

    listC.stream()
        .filter(c -> c.isUpperCase(c))
        .forEach(System.out::println);
  }
}
