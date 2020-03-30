import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        int chickenLegs = 2;
        int pigLegs = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of chickens you have.");

        int chickens = scanner.nextInt();

        System.out.println();

        System.out.println("Now, please enter the number of pigs you have.");

        int pigs = scanner.nextInt();

        System.out.println();

        chickenLegs = chickens * chickenLegs;
        pigLegs = pigs * pigLegs;

        int legsTotal = chickenLegs + pigLegs;

        System.out.println("The number of legs on your farm is: " + legsTotal);

    }
}