public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


       /* The steps in this comment are performed by the "reverse" function defined below


       //create a char array of the string
        char [] toBeReversedChar =new char[toBeReversed.length()];

        // Copy character by character into array
        for (int i = 0; i < toBeReversed.length(); i++) {
            toBeReversedChar[i] = toBeReversed.charAt(i);
        }


        // loop for reverse
        for(int i=0; i<toBeReversedChar.length/2; i++) {
            char temp = toBeReversedChar[i];
            toBeReversedChar[i] = toBeReversedChar[toBeReversedChar.length - i - 1];
            toBeReversedChar[toBeReversedChar.length - i - 1] = temp;
        }
            System.out.println(toBeReversedChar);
       */

        reverse(toBeReversed);
    }

    //the sequence above put in a method
    public static void reverse(String stringToReverse){
        char [] stringToReverseChar =new char[stringToReverse.length()];

        for (int i = 0; i < stringToReverse.length(); i++) {
            stringToReverseChar[i] = stringToReverse.charAt(i);
        }

        for(int i=0; i<stringToReverseChar.length/2; i++) {
            char temp = stringToReverseChar[i];
            stringToReverseChar[i] = stringToReverseChar[stringToReverseChar.length - i - 1];
            stringToReverseChar[stringToReverseChar.length - i - 1] = temp;
        }
        System.out.println(String.valueOf(stringToReverseChar));
    }
}
