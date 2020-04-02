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
  public void eat_HungerValue0_HungerValueEquals0(){
    Animal animal = new Animal(0,50);
    animal.eat();

    assertEquals(0, animal.hunger);
  }

  @Test
  public void eat_HungerValueNegative_HungerValueSetToZero(){
    Animal animal = new Animal(-10,50);
    animal.eat();

    assertEquals(0, animal.hunger);
  }

  @Test
  public void drink_DefaultThirstValue50_ThirstEquals49(){
    Animal animal = new Animal();

    animal.drink();

    assertEquals(49, animal.thirst);
  }

  @Test
  public void eat_ThirstValue0_HungerValueEquals0(){
    Animal animal = new Animal(50,0);
    animal.drink();

    assertEquals(0, animal.thirst);
  }

  @Test
  public void eat_ThirstValueNegative_HungerValueSetToZero(){
    Animal animal = new Animal(50,-10);
    animal.drink();

    assertEquals(0, animal.thirst);
  }

  @Test
  public void play_DefaultThirstHungerValues50_HungerThirstEquals51(){
    Animal animal = new Animal();

    animal.play();

    assertEquals(51, animal.thirst);
    assertEquals(51, animal.hunger);
  }


}