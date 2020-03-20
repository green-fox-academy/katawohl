package extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

  int add(int a, int b) {
    return a + b;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > c && b > a) {
      return b;
    } else {
      return c;
    }
  }

  public int median(List<Integer> pool) {
    Collections.sort(pool);

    int medianIfEven;
    int medianIfOdd;

    if (pool.size() % 2 == 0) {
      medianIfEven = (pool.get(pool.size() / 2 - 1) + pool.get(pool.size() / 2)) / 2;
      return medianIfEven;
    } else {
      medianIfOdd = pool.get(pool.size() / 2);
      return medianIfOdd;
    }
  }

  public boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  public String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }

  //region old code
/*  int add(int a, int b) {
    return 5;
  }

  public int maxOfThree(int a, int b, int c) {
    if (a > b)
      return a;
    else
      return c;
  }

  public int median(List<Integer> pool) {
    return pool.get((pool.size()-1)/2);
  }

  public boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  public String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }*/
//endregion
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume
//  that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed