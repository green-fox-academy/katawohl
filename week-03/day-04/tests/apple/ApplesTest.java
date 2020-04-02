package apple;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplesTest {

  Apples apple = new Apples();

  @Test
  public void getAppleValid() {
    assertEquals("apple", apple.getApple());
  }

  @Test
  public void getAppleNotValid(){
   assertNotEquals("bpple", apple.getApple());
  }
}