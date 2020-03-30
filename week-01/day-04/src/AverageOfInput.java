import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //

        System.out.println("Welcome! Now we will ask you to type in 5 whole numbers in a row.");

        System.out.println();
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int inputCount = 5;

        for (int i = 1; i <= inputCount; i++) {
            System.out.println("Kérem a(z) " + i + ". számot:");
            int number = scanner.nextInt();
            sum = number + sum;
        }

        double average = (sum / inputCount);

        System.out.println("Sum: " + sum + ", average: " + average);

    }
}
