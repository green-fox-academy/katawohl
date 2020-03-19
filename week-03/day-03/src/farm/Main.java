package farm;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Animal> animalList = new ArrayList<>();

    animalList.add(new Animal(11,54));
    animalList.add(new Animal(45,11));
    animalList.add(new Animal(0,4));
    animalList.add(new Animal(21,23));
    animalList.add(new Animal(8, 34));


    Farm farm = new Farm(animalList, 1);

    farm.breed();

    farm.slaughter();

  }
}
