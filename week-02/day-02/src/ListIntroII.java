import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListIntroII {

    public static void main(String[] args) {

        //Create a list ('List A') which contains the following values
        //Apple, Avocado, Blueberries, Durian, Lychee

        ArrayList<String> ListA = new ArrayList<>();

        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        System.out.println(ListA);

        //Create a new list ('List B') with the values of List A

        ArrayList<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);

        //Remove Durian from List B
        ListB.remove("Durian");

        System.out.println(ListB);

        //Add Kiwifruit to List A after the 4th element

        ListA.add(3, "Kiwifruit");

        System.out.println(ListA);

        //Compare the size of List A and List B

        boolean isEqual = ListA.equals(ListB);      //false
        System.out.println(isEqual);

        //Get the index of Avocado from List A
        System.out.println(ListA.indexOf("Avocado"));

        //Get the index of Durian from List B
        System.out.println(ListB.indexOf("Durian"));

        //Add Passion Fruit and Pomelo to List B in a single statement
        ListB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));

        System.out.println(ListB);

        //Print out the 3rd element from List A
        System.out.println(ListB.get(2));
    }
}
