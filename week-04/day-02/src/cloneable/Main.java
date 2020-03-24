package cloneable;


import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("John", 20, Person.Gender.male, "BME");

    student.introduce();

    System.out.println();

    student.clone().introduce();
  }
}
