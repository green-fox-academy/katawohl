package sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

  Sum summy = new Sum();

  @Test
  public void gimmeSumManyNums() {
    int[] inputNumbers = {4, 5, 2, 2, 44};
    assertEquals(57, summy.gimmeSum(inputNumbers));
  }

  @Test
  public void gimmeSumOneNum() {
    int[] inputNumbers = {2};

    assertEquals(2, summy.gimmeSum(inputNumbers));
  }

  @Test
  public void gimmeSumNull() {
    int[] inputNumbers = null;

    assertEquals(0, summy.gimmeSum(inputNumbers));
  }
}