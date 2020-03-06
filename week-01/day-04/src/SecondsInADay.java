public class SecondsInADay {
    public static void main(String[] args) {

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int totalHrsDay = 24;
        int totalMinsHour = 60;
        int totalSecsMin = 60;

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;


        int totalSecDay = (totalHrsDay * totalMinsHour * totalSecsMin);

        int secondsPassed = (currentHours * totalMinsHour * totalSecsMin + currentMinutes * totalSecsMin + currentSeconds);

        int remainingSeconds =  totalSecDay - secondsPassed;

        System.out.println(remainingSeconds);
    }
}
