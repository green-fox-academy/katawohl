import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, type in a number:");

        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int space = 1; space <= num - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
