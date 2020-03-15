// - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 4, 5]`
// - Increment the third element
// - Print the third element

public class IncrementElement {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println("The element at " + i + " is " + numbers[i]);
        }*/

        numbers[2]++;

        System.out.println(numbers[2]);

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println("The element at " + i + " is " + numbers[i]);
        }
        */
    }
}
