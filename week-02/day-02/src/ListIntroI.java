import java.util.ArrayList;
import java.util.Collections;

public class ListIntroI {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //Adding elements to the list
        names.add("william");
        names.add("john");
        names.add("amanda");

        System.out.println(names);

        //Print out the number of elements in the list
        int itemCount = names.size();
        System.out.println(itemCount);

        //Print out the 3rd element

        System.out.println(names.get(2));
        
        //Iterate through the list and print out each name

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Iterate through the list and print
        //1. William
        //2. John
        //3. Amanda

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i+1  +". " +names.get(i));
        }


        //Remove the 2nd element
        names.remove(names.get(1));

        System.out.println(names);

        //Iterate through the list in a reversed order and print out each name
        //Amanda
        //William

        Collections.reverse(names);

        System.out.println(names);

        //Remove all elements
        names.clear();
        System.out.println(names);

    }
}
