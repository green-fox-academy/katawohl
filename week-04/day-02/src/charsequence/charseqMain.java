package charsequence;

public class charseqMain {

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    Shifter s = new Shifter("example", 2);

    System.out.println(g.length());

    System.out.println(g.charAt(1));

    System.out.println(g.subSequence(1, 4));

    System.out.println(s.charAt(0));

    System.out.println(s.subSequence(1, 3));
  }
}
