package charsequence;

public class Shifter implements CharSequence {
  String string;
  int shiftNum;

  public Shifter(String string, int shiftNum) {
    this.string = string;
    this.shiftNum = shiftNum;
  }

  @Override
  public int length() {
    int stringLength = this.string.toCharArray().length;
    return stringLength;
  }

  @Override
  public char charAt(int i) {
    char[] stringToShift = this.string.toCharArray();
    return stringToShift[shiftNum + i];
  }

  @Override
  public String subSequence(int i, int i1) {
    if (i1 > i) {
      char[] stringToShift = this.string.toCharArray();
      char[] shiftedCharArray = new char[i1 - i];
      int counter = 0;
      for (int j = i - 1 + shiftNum; j < i1 - 1 + shiftNum; j++) {
        stringToShift[j] = shiftedCharArray[counter];
        counter++;
      }
      String shiftedChars = String.copyValueOf(shiftedCharArray);

      return shiftedChars;
    } else {
      return null;
    }
  }
}
