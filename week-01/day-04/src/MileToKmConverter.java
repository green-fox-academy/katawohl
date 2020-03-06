import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        double milesToKmRatio = 1.60934;

        System.out.println("Welcome! Please type in how many miles you traveled with your vehicle.");

        Scanner scanner = new Scanner(System.in);

        double miles = scanner.nextDouble();

        double milesToKm = (miles * milesToKmRatio);

        System.out.println();

        System.out.println("The distance you traveled in km: " + milesToKm);
    }
}
