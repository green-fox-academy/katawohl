import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteMultipleLines {

    // Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

    public static void main(String[] args) {
        try {
            WriteMultipleLines("my-file.txt", "apple", 5);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }


    public static void WriteMultipleLines(String filePath, String word, int num) throws IOException {
        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);

        for (int i = 0; i < num; i++) {
            lines.add(word);
            Files.write(path, lines);
        }
    }
}
