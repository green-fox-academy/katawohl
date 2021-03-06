package greenfoxinheritance;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super("Jane Doe", 30, Gender.female);
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, Gender gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  @Override
  public void introduce() {
    System.out.println("Hi! I am " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender() + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDays = +numberOfDays;
  }
}
