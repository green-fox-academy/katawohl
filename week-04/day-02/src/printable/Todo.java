package printable;

public class Todo implements Printable {
  private String task;
  private String priority;
  boolean isDone;

  public Todo(String task, String priority, boolean isDone) {
    this.task = task;
    this.priority = priority;
    this.isDone = isDone;
  }

  @Override
  public void printAllFields() {
    System.out.println("Task: " + this.task + " | Priority: " + this.priority + " | Done: " + this.isDone);
  }
}
