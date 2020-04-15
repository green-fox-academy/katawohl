package ex10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

public class Exercise10 {

  public static void main(String[] args) {
    Fox fox1 = new Fox("abe", "green", 10);
    Fox fox2 = new Fox("babe", "blue", 2);
    Fox fox3 = new Fox("abi", "green", 4);
    Fox fox4 = new Fox("babi", "yellow", 8);
    Fox fox5 = new Fox("abebi", "purple", 6);

    List<Fox> foxList = Arrays.asList(fox1, fox2, fox3, fox4, fox5);

    //Write a Stream Expression to find the foxes with green color!

    foxList.stream()
        .filter(fox -> fox.getColor() == "green")
        .forEach(fox -> System.out.println(fox.getName()));

    //Write a Stream Expression to find the foxes with green color, and age less then 5 years!

    foxList.stream()
        .filter(fox -> fox.getColor() == "green" && fox.getAge()<5)
        .forEach(fox -> System.out.println(fox.getName()));

    //Write a Stream Expression to find the frequency of foxes by color!

    Map<String, Long> freqOfFoxByColor =
    foxList.stream()
        .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));

    System.out.println(freqOfFoxByColor);
  }
}
