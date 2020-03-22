package littleexercise;

public class Person {
  String name;
  int age;
  Gender gender;

  public enum Gender {
    male,
    female
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = Gender.female;
  }

  public Person(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void introduce() {
    System.out.println("Hi! I am " + this.name + ", a " + this.age + " year old " + this.gender + ".");
  }
  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }
}
