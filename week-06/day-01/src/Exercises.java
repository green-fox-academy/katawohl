import java.util.Arrays;
import java.util.List;

public class Exercises {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    //Write a Stream Expression to get the even numbers from the following list:

    numbers.stream()
        .filter(number -> number % 2 == 0)
        .forEach(System.out::println);

    System.out.println("--------------------------");

    //Write a Stream Expression to get the squared value of the positive numbers from the following list:

    numbers.stream()
        .filter(number -> number >= 0)
        .map(number -> number *= number)
        .forEach(System.out::println);

    System.out.println("--------------------------");

    //Write a Stream Expression to find which number squared value is more then 20 from the following list:

    List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);

    numbers2.stream()
        .filter(number -> number*number > 20)
        .forEach(System.out::println);
  }

}
