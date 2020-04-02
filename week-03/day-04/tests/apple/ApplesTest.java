package apple;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplesTest {

  Apples apple = new Apples();

  @Test
  public void getApple_Expected_Valid() {
    assertEquals("apple", apple.getApple());
  }

  @Test
  public void getApple_Unexpected_NotValid(){
   assertNotEquals("bpple", apple.getApple());
  }
}