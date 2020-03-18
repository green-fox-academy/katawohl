package studentteacher;

public class Main {

  public static void main(String[] args) {
    Student walter = new Student();
    Teacher neni = new Teacher("Mari neni");

    neni.teach(walter);

    walter.question(neni);
  }
}
