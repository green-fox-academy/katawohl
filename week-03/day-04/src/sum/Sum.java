package sum;

public class Sum {
  public Sum() {
  }

  public int gimmeSum(int [] intputNumbers){
    int sum = 0;
    if (intputNumbers != null){
    for (int i = 0; i < intputNumbers.length; i++) {
      sum += intputNumbers[i];
    }
    return sum;}
    else {
      return 0;
    }
  }
}
