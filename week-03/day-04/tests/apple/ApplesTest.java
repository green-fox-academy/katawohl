package apple;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplesTest {

  Apples apple = new Apples();

  @Test
  public void getApple() {

    assertEquals("apple", apple.getApple());
  }
}