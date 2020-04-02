package countletters;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class CountLettersTest {
  CountLetters countLetters = new CountLetters();

  @Test
  public void gimmeHash_WithMixedCharactersCorrectHashMap_AllOK() {
    HashMap<Character, Integer> expectedHash = new HashMap<>();
    expectedHash.put('a', 3);
    expectedHash.put('f', 2);
    expectedHash.put('l', 2);

    assertEquals(expectedHash, countLetters.gimmeHash("alfalfa"));
  }

  @Test
  public void gimmeHash_WithSingleCharacterMultipleOccurrenceCorrectHashMap_AllOK() {
    HashMap<Character, Integer> expectedHash = new HashMap<>();
    expectedHash.put('a', 5);

    assertEquals(expectedHash, countLetters.gimmeHash("aaaaa"));
  }

  @Test
  public void gimmeHash_WithMixedCharactersWrongHashMap_ShouldNotEqual() {
    HashMap<Character, Integer> expectedHash = new HashMap<>();
    expectedHash.put('a', 3);
    expectedHash.put('f', 2);
    expectedHash.put('l', 4);

    assertNotEquals(expectedHash, countLetters.gimmeHash("alfalfa"));

  }

  @Test
  public void gimmeHash_WithSingleCharacterMultipleOccurrenceWrongHashMap_ShouldNotEqual() {
    HashMap<Character, Integer> expectedHash = new HashMap<>();
    expectedHash.put('a', 3);

    assertNotEquals(expectedHash, countLetters.gimmeHash("aaaaaa"));

  }

  @Test
  public void gimmeHash_NoCharactersEmptyHashMap_AllOk(){
    HashMap<Character, Integer> expectedHash = new HashMap<>();

    assertEquals(expectedHash, countLetters.gimmeHash(""));
  }

  @Test
  public void gimmeHash_NoCharactersNonEmptyHashMap_ShouldNotEqual(){
    HashMap<Character, Integer> expectedHash = new HashMap<>();
    expectedHash.put('a', 3);

    assertNotEquals(expectedHash, countLetters.gimmeHash(""));
  }
}