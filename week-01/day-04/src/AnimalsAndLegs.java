import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        System.out.println("Welcome! Please enter the number of chickens you have.");

        Scanner scanner1 = new Scanner(System.in);

        int chickens = scanner1.nextInt();

        System.out.println();

        System.out.println("Now, please enter the number of pigs you have.");

        Scanner scanner2 = new Scanner(System.in);

        int pigs = scanner2.nextInt();

        System.out.println();

        int legs = chickens * 2 + pigs * 4;

        System.out.println("The number of legs on your farm is: " + legs);

        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}