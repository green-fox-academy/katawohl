package fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void fiboCompute_SequenceOfFive_Valid() {
    Fibonacci fibonacci = new Fibonacci();


    long fiboNum = fibonacci.fiboCompute(5);

    assertEquals(3, fiboNum);
  }

  @Test
  public void fiboCompute_SequenceOfHunderd_Valid() {
    Fibonacci fibonacci = new Fibonacci();

    long fiboNum = fibonacci.fiboCompute(35);

    assertEquals(5702887, fiboNum);

  }

}