package anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  Anagram anagram = new Anagram();

  @Test
  public void areTheTwoAnagrams() {

    assertTrue(anagram.areTheTwoAnagrams("ahfjhaiehfsgbjkas", "ahjfhaiehfsgbjkas"));
  }
}