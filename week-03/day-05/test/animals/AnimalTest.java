package animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

  @Test
  public void testEat_Valid(){
    Animal animal = new Animal();

    animal.eat();

    assertEquals(49, animal.hunger);
  }

  @Test
  public void testDrink_Valid(){
    Animal animal = new Animal();

    animal.drink();

    assertEquals(49, animal.thirst);
  }

  @Test
  public void testPlay_Valid(){
    Animal animal = new Animal();

    animal.play();

    assertEquals(51, animal.thirst);
    assertEquals(51, animal.hunger);
  }


}