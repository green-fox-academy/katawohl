package studentteacher;

public class Teacher {
  String nameTeacher;

  public Teacher(String nameTeacher) {
    this.nameTeacher = nameTeacher;
  }

  public void answer() {
    System.out.println("The teacher is answering a very insightful question");
  }

  public void teach(Student namestudent) {
    namestudent.learn();
  }
}
