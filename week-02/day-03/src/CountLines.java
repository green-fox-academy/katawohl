import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    public static void main(String[] args) {

       try {
           numOfLines("my-file1.txt");
           System.out.println(numOfLines("my-file1.txt"));
        } catch (IOException e) {
            System.out.println("0");
        }

    }

    public static int numOfLines(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);

        int size = lines.size();
        return size;
    }

}
