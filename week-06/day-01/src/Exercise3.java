import java.util.Arrays;
import java.util.List;


public class Exercise3 {

  public static void main(String[] args) {
    //Write a Stream Expression to find which number squared value is more then 20 from the
    // following list:

    List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);

    numbers2.stream()
        .filter(number -> number * number > 20)
        .forEach(System.out::println);
  }
}
