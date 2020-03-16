// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {

  public static void main(String[] args) throws IOException {
    try {
      System.out.println(Arrays.toString(UniqueIPAddresses("assets/logs.txt")));
    } catch (IOException e) {
      System.out.println("No such file exists");
    }

    try {
      System.out.println(GetPostRati("assets/logs.txt"));
    }catch (IOException e) {
      System.out.println("No such file exists");
    }

  }

  public static String[] UniqueIPAddresses(String fileToRead) throws IOException {
    Path path = Paths.get(fileToRead);

    List<String> lines = Files.readAllLines(path);
    List<String> ipAddressUnique = new ArrayList<>();
    for (String line : lines) {
      String[] splitBySpace = line.split(" ");
      if (!ipAddressUnique.contains(splitBySpace[8])) {
        ipAddressUnique.add(splitBySpace[8]);
      }
    }

    String[] ipAddressArray = new String[ipAddressUnique.size()];
    ipAddressUnique.toArray(ipAddressArray);

    return ipAddressArray;

  }

  public static double GetPostRati(String fileToRead) throws IOException {
    Path path = Paths.get(fileToRead);

    List<String> lines = Files.readAllLines(path);
    int counterGET = 0;
    int counterPOST = 0;
    for (String line : lines) {
      String[] splitBySpace = line.split(" ");
      if (splitBySpace[11].equals("GET")) {
        counterGET++;
      } else {
        counterPOST++;
      }

    }
    double ratio = counterGET / counterPOST;
    return ratio;
  }

}