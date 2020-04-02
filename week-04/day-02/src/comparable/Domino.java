package comparable;

public class Domino implements Comparable<Domino> {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeft() {
    return left;
  }

  public int getRight() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }

  @Override
  public int compareTo(Domino domino) {
    int result = Integer.compare(this.left, domino.left);
    if (result == 0){
      result = Integer.compare(this.right, domino.right);
    }
    return result;
  }
}
