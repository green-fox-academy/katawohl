package fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void fiboCompute_SequenceOfFive_ReturnsFifthFiboNum() throws Exception {
    Fibonacci fibonacci = new Fibonacci();


    long fiboNum = fibonacci.fiboCompute(5);

    assertEquals(3, fiboNum);
  }

  @Test
  public void fiboCompute_SequenceOf47_Returns47thFibonacciNum() throws Exception {
    Fibonacci fibonacci = new Fibonacci();

    long fiboNum = fibonacci.fiboCompute(47);

    assertEquals(1836311903, fiboNum);
  }


  @Test
  public void fiboCompute_SequenceOf48_ExceptionThrown() throws Exception {
    Fibonacci fibonacci = new Fibonacci();

    fibonacci.fiboCompute(48);
  }

}