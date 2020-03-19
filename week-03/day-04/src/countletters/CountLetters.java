package countletters;

import java.util.HashMap;

public class CountLetters {
  public CountLetters() {
  }

  public HashMap gimmeHash(String string) {
    HashMap hash = new HashMap();

    char[] stringToCharacters = string.toCharArray();

    for (int i = 0; i < stringToCharacters.length; i++) {
      Integer counter = 0;
      for (int j = 0; j < stringToCharacters.length; j++) {
        if (stringToCharacters[i] == stringToCharacters[j]) {
          counter++;
        }
      }
      hash.put(stringToCharacters[i], counter);
    }
    return hash;
  }

/*  public static void main(String[] args) {
    CountLetters countLetters = new CountLetters();

    System.out.println(countLetters.gimmeHash("alfalfa"));
  }*/
}
