package animals;

public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    this(50, 50);
  }

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat() {
    if (this.hunger == 0) {
      return;
    } else if (this.hunger < 0){
      this.hunger = 0;
    } else {
      hunger--;
    }
  }

  public void drink() {
    if (this.thirst == 0) {
      return;
    } else if (this.thirst < 0){
      this.thirst = 0;
    } else {
      thirst--;
    }
  }

  public void play() {
    hunger++;
    thirst++;
  }
}
