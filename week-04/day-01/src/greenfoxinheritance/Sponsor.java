package greenfoxinheritance;

public class Sponsor extends Person {
  String nameOfCompany;
  int studentsHired;

  public Sponsor() {
    super("Jane Doe", 30, Gender.female);
    this.nameOfCompany = "Google";
    this.studentsHired = 0;
  }

  public Sponsor(String name, int age, Gender gender, String nameOfCompany) {
    super(name, age, gender);
    this.nameOfCompany = nameOfCompany;
    this.studentsHired = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hi! I am " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender() + " who represents " + this.nameOfCompany + " and hired " + this.studentsHired + " students so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire() {
    this.studentsHired++;
  }
}
