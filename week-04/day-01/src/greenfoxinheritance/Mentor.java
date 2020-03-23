package greenfoxinheritance;

public class Mentor extends Person {
  Level level;

  public enum Level {
    junior,
    intermediate,
    senior
  }

  public Mentor() {
    super("Jane Doe", 30, Gender.female);
    this.level = Level.intermediate;
  }

  public Mentor(String name, int age, Gender gender, Level level) {
    super(name, age, gender);
    this.level = level;
  }

  @Override
  public void introduce() {
    System.out.println("Hi! I am " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender() + " " + this.level + " mentor.");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

}
