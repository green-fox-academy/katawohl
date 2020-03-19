package countletters;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class CountLettersTest {
  CountLetters countLetters = new CountLetters();

  @Test
  public void gimmeHash() {
    HashMap<Character, Integer> expectedHash = new HashMap<>();
    expectedHash.put('a', 3);
    expectedHash.put('f', 2);
    expectedHash.put('l', 2);

    assertEquals(expectedHash, countLetters.gimmeHash("alfalfa"));
  }
}