public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        double heightInMSq = Math.pow(heightInM, 2);

        //System.out.println(heightInMSq);

        double bmi = (massInKg / heightInMSq);

        System.out.println("Your BMI is " + bmi);
    }
}
