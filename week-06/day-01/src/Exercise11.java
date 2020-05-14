import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Exercise11 {
  public static void main(String[] args) throws IOException {
    String fileName = "assets/wikiarticle.txt";

    List<String> lines = Files.readAllLines(Paths.get(fileName));

  }
}
