public class Factorio {

    public static void main(String[] args) {
        //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
        int num = 10;
        System.out.println(factorio(num));
    }

    public static int factorio(int a){
        int [] arrayNumber = new int[a];

        for (int i =0; i < a; i++) {

            arrayNumber[i] = i +1;
        }

        int sum = 1;

        for (int num : arrayNumber){
            sum = sum * num;
        }
        return sum;
    }
}
