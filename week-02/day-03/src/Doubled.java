import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the doubled.txt

        //region old code
        /*
        Path path = Paths.get("doubled.txt");

        List<String> contentStringAr = Files.readAllLines(path);

        String contentString = contentStringAr.toString();

        char[] characterList = contentString.toCharArray();

        String charReduced = "";

        for (int i = 0; i < characterList.length; i += 2) {
            charReduced = charReduced + (characterList[i]);
        }


        System.out.println(charReduced);

        Path reduced = Paths.get("reduced.txt");

        Files.write(reduced, Collections.singleton(charReduced));
*/

        //endregion

        try {
            printSecond("doubled.txt", "reduced.txt");
        } catch (IOException e) {
            System.out.println("File IO problem");
        }

    }

    public static void printSecond(String ogFile, String reducedFile) throws IOException {
        Path content = Paths.get(ogFile);

        List<String> contentStringAr = Files.readAllLines(content);

        String contentString = contentStringAr.toString();

        char[] characterList = contentString.toCharArray();

        StringBuilder charReduced = new StringBuilder();

        for (int i = 0; i < characterList.length; i += 2) {
            charReduced.append(characterList[i]);
        }

        System.out.println(charReduced);

        Path reduced = Paths.get(reducedFile);

        Files.write(reduced, Collections.singleton(charReduced.toString()));
    }
}


