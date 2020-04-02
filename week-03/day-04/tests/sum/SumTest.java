package sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

  Sum summy = new Sum();

  @Test
  public void gimmeSum_ManyNumsInArray_ReturnsSum() {
    int[] inputNumbers = {4, 5, 2, 2, 44};
    assertEquals(57, summy.gimmeSum(inputNumbers));
  }

  @Test
  public void gimmeSum_OneNumInArray_ReturnsThatNum() {
    int[] inputNumbers = {2};

    assertEquals(2, summy.gimmeSum(inputNumbers));
  }

  @Test
  public void gimmeSum_NullArray_ReturnsZero() {
    int[] inputNumbers = null;

    assertEquals(0, summy.gimmeSum(inputNumbers));
  }

  @Test
  public void gimmeSum_OnlyZerosInArray_ReturnsZero() {
    int[] inputNumbers = {0, 0, 0, 0, 0, 0, 0, 0};

    assertEquals(0, summy.gimmeSum((inputNumbers)));
  }
}