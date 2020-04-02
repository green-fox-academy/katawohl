package anagram;

import java.util.Arrays;

public class Anagram {

  public Anagram() {
  }

  //region palindrome instead of anagram
 /* public boolean areTheTwoAnagrams(String string1, String string2) {

    char[] string1CharAr = string1.toCharArray();
    char[] string1ReversedAr = new char[string1CharAr.length];

    for (int i = 0; i < string1CharAr.length; i++) {
      string1ReversedAr[string1CharAr.length - i - 1] = string1CharAr[i];
    }

    String string1Reversed = String.copyValueOf(string1ReversedAr);

    return (string1Reversed.equals(string2));
  }
*/
  //endregion

  public boolean areTheTwoAnagrams(String stringOne, String stringToCompare) {
    char[] stringOneAsCharArry = stringOne.toCharArray();
    char[] stringToCompareAsCharArray = stringToCompare.toCharArray();

    Arrays.sort(stringOneAsCharArry);
    Arrays.sort(stringToCompareAsCharArray);

    return Arrays.equals(stringOneAsCharArry, stringToCompareAsCharArray);
  }
}
