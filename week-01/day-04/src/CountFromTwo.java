import javax.swing.*;
import java.util.Scanner;

public class CountFromTwo {
    public static void main(String[] args) {

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, type in a number:");

        int num1 = scanner.nextInt();

        System.out.println("Please, type in another number:");

        int num2 = scanner.nextInt();

        if (num2 <= num1) {
            System.out.println("The second number should be bigger!");
        } else {
            for (int i = num1; i < num2; i++) {
                System.out.println(i);
            }
        }
    }
}
