package animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

  @Test
  public void eat_DefaultHungerValue50_HungerEquals49(){
    Animal animal = new Animal();

    animal.eat();

    assertEquals(49, animal.hunger);
  }

  @Test
  public void drink_DefaultThirstValue50_ThirstEquals49(){
    Animal animal = new Animal();

    animal.drink();

    assertEquals(49, animal.thirst);
  }

  @Test
  public void play_DefaultThirstHungerValues50_HungerThirstEquals51(){
    Animal animal = new Animal();

    animal.play();

    assertEquals(51, animal.thirst);
    assertEquals(51, animal.hunger);
  }


}