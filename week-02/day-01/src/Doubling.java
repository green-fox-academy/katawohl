public class Doubling {
    public static void main(String[] args) {
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`

        int baseNum = 123;
        System.out.println(doubling(baseNum));
        doublingVoid(baseNum);
    }

    public static int doubling(int n) {
       return 2*n;
    }

    public static void doublingVoid(int n) {
        System.out.println(2*n);
    }
}