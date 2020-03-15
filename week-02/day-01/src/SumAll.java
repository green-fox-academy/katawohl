// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `numbers`

public class SumAll {

    public static void main(String[] args) {

        int[] numbers = {3, 4, 5, 6, 7};

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of array elements is: " + sum);
    }
}
