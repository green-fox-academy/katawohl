public class ChangeElement {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element

        int numbers[] = {1, 2, 3, 8, 5, 6};

        //printing the original elements in the array
       /* for (int j = 0; j < numbers.length ; j++) {
            System.out.println(numbers[j]);
        }
        System.out.println();
*/
        int n = 8;
        int n2 = 4;

        //in this loop, the commented lines are there to print the whole array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n){
                numbers[i] = n2;
            }
            //System.out.println(numbers[i]);
        }
        //System.out.println();

        System.out.println(numbers[3]);

//just another way to print the elements(?) in an array
       /* for (int i = 0; i < numbers.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ numbers[i]);*/
    }
}
