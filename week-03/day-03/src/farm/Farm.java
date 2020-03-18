package farm;

/*Create a Farm class
it has list of Animals
        it has slots which defines the number of free places for animals
    breed() -> creates a new animal if there's place for it
    slaughter() -> removes the least hungry animal*/

import java.util.List;

public class Farm {
  List<Animal> animals;
  int slots;

  public Farm(List<Animal> animals, int slots) {
    this.animals = animals;
    this.slots = slots;
  }

  public void breed() {

    Animal animal = new Animal();
    if (slots > 0) {
      animals.add(animal);
      slots--;
    }
  }

  public void slaughter() {
    Animal animalZero = animals.get(0);

    for (Animal animal : animals) {
      if (animal.thirst < animalZero.thirst) {
        animalZero = animal;
      }
    }

    animals.remove(animalZero);

    slots++;
  }
}
