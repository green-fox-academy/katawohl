package littleexercise;

public class Sponsor {
  String name;
  int age;
  Gender gender;
  String nameOfCompany;
  int studentsHired;

  public enum Gender {
    male,
    female
  }

  public Sponsor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = Gender.female;
    this.nameOfCompany = "Google";
    this.studentsHired = 0;
  }

  public Sponsor(String name, int age, Gender gender, String nameOfCompany) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.nameOfCompany = nameOfCompany;
    this.studentsHired = 0;
  }

  public void introduce() {
    System.out.println("Hi! I am " + this.name + ", a " + this.age + " year old " + this.gender + " who represents " + this.nameOfCompany + " and hired " + this.studentsHired + " students so far.");
  }
  public void getGoal(){
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire(){
    this.studentsHired++;
  }
}
