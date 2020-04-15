import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the frequency of characters in a given string!

    String string = "aasssssjjjjjjiiil";

    char[] charactersOfString = string.toCharArray();

    List<Character> listC = new ArrayList<>();
    for (char c : charactersOfString) {
      listC.add(c);
    }

    Map<Object, Long> freqOfChars =
        listC.stream()
         .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    System.out.println(freqOfChars);
  }
}
