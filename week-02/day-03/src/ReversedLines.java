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
            printRev("assets/reversed-lines.txt", "assets/re-revlines.txt");
        } catch (IOException e) {
            System.out.println("File IO problem");
        }
    }

    public static void printRev(String originalFile, String reversedFile) throws IOException {
        Path content = Paths.get(originalFile);

        List<String> contentStringAr = Files.readAllLines(content);

        /*for (String line : contentStringAr) {
            for (int i = 0; i < line.length() / 2; i++) {
                char firstChar = line.charAt(i);
                char lastChar = line.charAt(line.length() - i - 1);
                char temp = line.charAt(i);
                firstChar = lastChar;
                lastChar = temp;
            }
            System.out.println();
        }
        System.out.println(contentStringAr);*/

        StringBuilder charReversed = new StringBuilder();

        for (String line : contentStringAr) {
            char[] characterList = line.toCharArray();
            for (int j = 0; j < characterList.length / 2; j++) {
                char temp = characterList[j];
                characterList[j] = characterList[characterList.length - j - 1];
                characterList[characterList.length - j - 1] = temp;
            }
            charReversed.append(characterList);
            System.out.println(charReversed);
        }

        Path reversed = Paths.get(reversedFile);

        Files.write(reversed, Collections.singleton(charReversed.toString()));
    }
}
