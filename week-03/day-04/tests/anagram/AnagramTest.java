package anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  Anagram anagram = new Anagram();

  @Test
  public void areTheTwoAnagrams_True_Valid() {
    assertTrue(anagram.areTheTwoAnagrams("ahfjhaiehfsgbjkas", "ahjfhaiehfsgbjkas"));
  }

  @Test
  public void areTheTwoAnagrams_False_Valid() {
    assertFalse(anagram.areTheTwoAnagrams("abcdefgh", "avcdefgh"));
  }
}