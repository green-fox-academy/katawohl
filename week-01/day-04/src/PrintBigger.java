import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Type in a number");

        Scanner scanner1 = new Scanner(System.in);

        int number1 = scanner1.nextInt();

        System.out.println("Type in another number");

        Scanner scanner2 = new Scanner(System.in);

        int number2 = scanner2.nextInt();

        if (number1 > number2){
            System.out.println("The bigger number is " + number1);
        } else {
            System.out.println("The bigger number is " + number2);
        }
    }
}
