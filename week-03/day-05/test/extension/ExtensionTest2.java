package extension;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ExtensionTest2 {

  Extension extension = new Extension();

  @Test
  public void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  public void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  public void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }


  @Test
  public void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  public void testMedian_four() {
    ArrayList evenList = new ArrayList<>(Arrays.asList(1, 1, 3, 4));

    assertEquals(2, extension.median(evenList));
  }

  @Test
  public void testMedian_five() {
    List<Integer> oddList = new ArrayList<>(Arrays.asList(1, 2, 5, 4, 3));

    assertEquals(3, extension.median(oddList));
  }

  @Test
  public void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  public void testIsVowel_c() {
    assertFalse(extension.isVowel('c'));
  }

  @Test
  public void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  public void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}