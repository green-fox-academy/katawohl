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
        double inputCount = 5.;

        for (int i = 1; i <= inputCount; i++) {
            System.out.println("Kérem a(z) " + i +  ". számot:");
            int number = scanner.nextInt();
            sum = number + sum;
        }

        double average = (sum / inputCount);

        System.out.println("Sum: " + sum + ", average: " + average);



/*
        int number1 = scanner.nextInt();


        int number2 = scanner.nextInt();



        int number3 = scanner.nextInt();


        int number4 = scanner.nextInt();

        int number5 = scanner.nextInt();

        int sum  = (number1 + number2 + number3 + number4 + number5);


        System.out.println();

        System.out.println("Sum: " + sum + ", " + "Average: " + average);
*/
        // Sum: 22, Average: 4.4
    }
}
