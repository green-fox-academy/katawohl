import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        try {
            printRev("reversed-lines.txt", "re-revlines.txt");
        } catch (IOException e) {
            System.out.println("File IO problem");
        }


    }

    public static void printRev(String ogFile, String reversedFile) throws IOException {
        Path content = Paths.get(ogFile);

        List<String> contentStringAr = Files.readAllLines(content);

        StringBuilder charReversed = new StringBuilder();

        for (String line : contentStringAr) {
            char[] characterList = line.toCharArray();
            for (int j = 0; j < characterList.length / 2; j++) {
                char temp = characterList[j];
                characterList[j] = characterList[characterList.length - j - 1];
                characterList[characterList.length - j - 1] = temp;
            }charReversed.append(characterList);
        }


        Path reversed = Paths.get(reversedFile);

        Files.write(reversed, Collections.singleton(charReversed.toString()));
    }
}
