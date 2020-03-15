// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        try {
            WriteOneLine("assets/my-file.txt", "Kata");
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }

    public static void WriteOneLine(String filePath, String myName) throws IOException {
        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);

        lines.add(myName);
        Files.write(path, lines);

    }

}
