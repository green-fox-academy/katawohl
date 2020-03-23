package greenfoxinheritance;

public class Person {
  private String name;
  private int age;
  private Gender gender;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void introduce() {
    System.out.println("Hi! I am " + this.name + ", a " + this.age + " year old " + this.gender + ".");
  }
  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }
}
