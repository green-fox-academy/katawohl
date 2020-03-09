import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {

// Create the usual class wrapper and main method on your own.

// Write a function called `sum`
// that returns the sum of numbers from zero to the given parameter
        int number = 10;

        System.out.println(sum(number));
    }

    public static int sum(int a){
       int [] arrayNumber = new int[a];

        for (int i =0; i < a; i++) {

            arrayNumber[i] = i +1;
        }

        int sum = 0;

        for (int num : arrayNumber){
            sum = sum + num;
        }
        return sum;
    }
}
