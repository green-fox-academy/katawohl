package anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  Anagram anagram = new Anagram();

  @Test
  public void areTheTwoAnagramsTrue() {
    assertTrue(anagram.areTheTwoAnagrams("ahfjhaiehfsgbjkas", "ahjfhaiehfsgbjkas"));
  }

  @Test
  public void areTheTwoAnagramsFalse() {
    assertFalse(anagram.areTheTwoAnagrams("abcdefgh", "avcdefgh"));
  }
}