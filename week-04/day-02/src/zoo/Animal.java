package zoo;

import java.awt.Color;

public abstract class Animal {
  protected String name;
  protected int age;
  protected Color color;
  protected String sex;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String breed();
}
