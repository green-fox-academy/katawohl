package domino;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their
    // adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    List<Domino> dominoesSnake = new ArrayList<>();

    Domino starterDomino = dominoes.get(0);
    dominoesSnake.add(starterDomino);

    for (int i = 0; i < dominoes.size(); i++) {
      Domino dom1 = dominoesSnake.get(i);
      for (int j = 0; j < dominoes.size(); j++) {
        Domino dom2 = dominoes.get(j);
        if (dom1.getRightSide() == dom2.getLeftSide()) {
          dominoesSnake.add(dom2);
        } else continue;
      }
    }

    dominoes = dominoesSnake;

    System.out.println(dominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
