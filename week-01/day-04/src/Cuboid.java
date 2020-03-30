public class Cuboid {
    public static void main(String[] args) {

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
        double sideA = 3;
        double sideB = 5;
        double sideC = 2;

        double surfaceArea = (sideA * sideB + sideA * sideC + sideB * sideC);

        double volume = (sideA * sideB * sideC);

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume " + volume);

    }
}
