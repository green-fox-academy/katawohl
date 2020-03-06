import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Type in a number");

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();

        System.out.println("Type in another number");

        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("The bigger number is " + number1);
        } else {
            System.out.println("The bigger number is " + number2);
        }
    }
}
