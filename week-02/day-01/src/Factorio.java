public class Factorio {

    public static void main(String[] args) {
        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

        int num = 10;
        System.out.println(factorio(num));
    }

    //region Solution with array 
/*    public static int factorio(int a) {
        int[] numbersBelow = new int[a];

        for (int i = 0; i < a; i++) {

            numbersBelow[i] = i + 1;
        }

        int sum = 1;

        for (int num : numbersBelow) {
            sum *= num;
        }
        return sum;
    }*/
    //endregion

    public static int factorio(int numToFactor) {
        int sum = 1;
        for (int i = 1; i <= numToFactor; i++) {
            sum *= i;
        }
        return sum;
    }
}
