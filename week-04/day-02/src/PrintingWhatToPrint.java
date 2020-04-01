import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import printable.Domino;
import printable.Todo;

public class PrintingWhatToPrint {
  public static void main(String[] args) {


    Domino domi1 = new Domino(3, 6);
    Domino domi2 = new Domino(1, 4);
    Domino domi3 = new Domino(2, 2);
    Domino domi4 = new Domino(5, 1);
    Domino domi5 = new Domino(4, 3);

    Todo todo1 = new Todo("Walk fish", "High", true);
    Todo todo2 = new Todo("Buy money", "medium", false);
    Todo todo3 = new Todo("Water mirror", "low", false);

    List<Domino> dominoList = new ArrayList<>();
    dominoList.addAll(Arrays.asList(domi1, domi2, domi3, domi4, domi5));

    List<Todo> todoList = new ArrayList<>();
    todoList.addAll(Arrays.asList(todo1, todo2, todo3));

    for (Domino domino: dominoList) {
      domino.printAllFields();
    }

    for (Todo todo: todoList) {
      todo.printAllFields();
    }
  }
}
