public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double heightInMSq = Math.pow(heightInM, 2);

        double bmi = (massInKg / heightInMSq);

        System.out.println("Your BMI is " + bmi);
    }
}
