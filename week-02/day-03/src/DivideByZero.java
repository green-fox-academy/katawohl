import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, type in a number");

        int divisor = sc.nextInt();

        try {
            System.out.println(divideTen(divisor));
        }catch (ArithmeticException e) {
            System.out.println("Fail");
        }
    }

    public static int divideTen(int divisor){
        return 10/divisor;
    }
}
