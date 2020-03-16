import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class ReversedLines {
  public static void main(String[] args) {
    reverseLines("assets/reversed-lines.txt", "assets/output-reversed-lines.txt");
  }
  private static void reverseLines(String pathToReverse, String pathReversed) {
    Path path = Paths.get(pathToReverse);
    try {
      List <String> lines = Files.readAllLines(path);
      List <String> reversedLines = new ArrayList<>();
      for (String line: lines) {
        String tempReversed = "";
        for (int i = 0; i <line.length() ; i++) {
          tempReversed += line.charAt(line.length()-i-1);
        }
        reversedLines.add(tempReversed);
      }
      Path filePathReversed = Paths.get(pathReversed);
      Files.write(filePathReversed, reversedLines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}