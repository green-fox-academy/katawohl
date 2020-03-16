// Create a method that decrypts reversed-order.txt

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    try {
      reversedOrder("assets/reversed-order.txt", "assets/output-reversed-order.txt");
    } catch (IOException e) {
      System.out.println("No such file exists");
    }


  }

  public static void reversedOrder(String fileToReverse, String reversedFile) throws IOException {
    Path toReverse = Paths.get(fileToReverse);

    List<String> contentToReverse = Files.readAllLines(toReverse);
    List<String> linesReversed = new ArrayList<String>();


    for (int i = 0; i < contentToReverse.size(); i++) {
      String line = contentToReverse.get(contentToReverse.size() - i - 1);
      linesReversed.add(line);
    }
    Path reversed = Paths.get(reversedFile);

    Files.write(reversed, linesReversed);

  }
}
