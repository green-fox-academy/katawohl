public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.

        int progHourDay = 6;
        int semesterLengthWeek = 17;
        int workDaysWeek = 5;
        double workHourWeek = 52.0;

        int progHourSem = progHourDay * semesterLengthWeek * workDaysWeek;

        System.out.println("A GreenFox Academy attendee spends " + progHourSem + " hours in a semester.");
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        double workHoursSem = (workHourWeek * semesterLengthWeek);

        double avrCodHourSem = (progHourSem / workHoursSem * 100);

        System.out.println(avrCodHourSem);
    }
}
