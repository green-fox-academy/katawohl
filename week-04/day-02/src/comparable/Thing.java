package comparable;

public class Thing implements Comparable<Thing> {
  private String name;
  private Boolean completed;

  public Thing(String name) {
    this.name = name;
    this.completed = false;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing other){
    int result = this.completed.compareTo(other.completed);
    if (result == 0) {
        result = this.name.compareTo(other.name);
    }
    return result;
  }

}
