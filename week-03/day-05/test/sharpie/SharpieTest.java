package sharpie;

import static org.junit.Assert.*;

import org.junit.Test;

public class SharpieTest {

  @Test
  public void use_InkPos_Valid() {
    Sharpie sharpie = new Sharpie("red", 10f,  3.2f);

    sharpie.use();

    assertEquals(2.2f, sharpie.inkAmount, 0.0f);
  }

  @Test
  public void use_InkZero_Valid() {
    Sharpie sharpie = new Sharpie("red", 10f,  0.0f);

    sharpie.use();

    assertEquals(-1.0f, sharpie.inkAmount, 0.0f);
  }
}