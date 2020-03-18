package studentteacher;

public class Student {
  //String nameStudent;

  public Student(){

  }

/*  public Student(String nameStudent) {
    this.nameStudent = nameStudent;
  }*/

  public void learn() {
    System.out.println("The student is learning something super interesting");
  }

  public void question(Teacher nameTeacher) {
    nameTeacher.answer();
  }
}
