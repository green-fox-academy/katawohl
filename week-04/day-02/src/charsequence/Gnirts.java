package charsequence;

/*It should have one String field that can be set via the constructor
    Implementing the interface's methods, always think of the field as if it was backwards, so at
     the second position of "this example" there is a 'p'
    In a main method try out all the methods*/

public class Gnirts implements CharSequence {
  String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    int stringLength = this.string.toCharArray().length;
    return stringLength;
  }

  @Override
  public char charAt(int i) {
    char[] stringToReverse = this.string.toCharArray();
    return stringToReverse[stringToReverse.length - 1 - i];
  }

  @Override
  public String subSequence(int i, int i1) {
    if (i1 > i) {
      char[] stringToReverse = this.string.toCharArray();
      char[] reversedCharArray = new char[i1 - i];
      int counter = 0;
      for (int j = i1 - 1; j > i - 1; j--) {
        stringToReverse[j] = reversedCharArray[counter];
        counter++;
      }
      String reversedChar = String.copyValueOf(reversedCharArray);
      return reversedChar;
    } else {
      return null;
    }
  }

}
