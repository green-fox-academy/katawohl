// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        try {
            System.out.println(CopyFile("assets/my-file.txt", "assets/my-file-copy.txt"));
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }

    public static boolean CopyFile(String fileName1, String fileName2) throws IOException {
        Path copyFrom = Paths.get(fileName1);
        Path copyTo = Paths.get(fileName2);

        List<String> contentToCopy = Files.readAllLines(copyFrom);

        Files.write(copyTo, contentToCopy);

        List<String> contentCopied = Files.readAllLines(copyTo);

        return (contentCopied.equals(contentToCopy));

    }
}
