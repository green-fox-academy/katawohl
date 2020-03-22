package littleexercise;

public class Mentor {
  String name;
  int age;
  Gender gender;
  Level level;

  public enum Gender {
    male,
    female
  }

  public enum Level {
    junior,
    intermediate,
    senior
  }

  public Mentor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = Gender.female;
    this.level = Level.intermediate;
  }

  public Mentor(String name, int age, Gender gender, Level level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level= level;
  }

  public void introduce() {
    System.out.println("Hi! I am " + this.name + ", a " + this.age + " year old " + this.gender + " " + this.level + " mentor.");
  }

  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }
}
