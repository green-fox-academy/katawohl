import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //

        System.out.println("Welcome! Now we will ask you to type in 5 whole numbers in a row.");

        System.out.println();

        System.out.println("The first number:");
        Scanner scanner1 = new Scanner(System.in);

        int number1 = scanner1.nextInt();

        System.out.println("The second number:");
        Scanner scanner2 = new Scanner(System.in);

        int number2 = scanner2.nextInt();

        System.out.println("The third number:");
        Scanner scanner3 = new Scanner(System.in);

        int number3 = scanner3.nextInt();

        System.out.println("The fourth number:");
        Scanner scanner4 = new Scanner(System.in);

        int number4 = scanner4.nextInt();

        System.out.println("The fifth number:");
        Scanner scanner5 = new Scanner(System.in);

        int number5 = scanner5.nextInt();

        int sum  = (number1 + number2 + number3 + number4 + number5);

        double average = (sum / 5.);

        System.out.println();

        System.out.println("Sum: " + sum + ", " + "Average: " + average);

        // Sum: 22, Average: 4.4
    }
}
