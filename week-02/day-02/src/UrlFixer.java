// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!

public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        //method 1 replace function
        url = url.replace("bots", "odds");

        url = url.replace("https//", "https://");


        System.out.println(url);

        //method 2 with StringBuffer
        //https://www.geeksforgeeks.org/stringbuffer-class-in-java/
        //StringBuffer is a peer class of String that provides much of the functionality of strings. String
        // represents fixed-length, immutable character sequences while StringBuffer represents growable and writable
        // character sequences.
        //
        //StringBuffer may have characters and substrings inserted in the middle or appended to the end. It will
        // automatically grow to make room for such additions and often has more characters preallocated than are
        // actually needed, to allow room for growth.

        StringBuffer url2 = new StringBuffer("https//www.reddit.com/r/nevertellmethebots");

        url2.insert(5, ":");

        System.out.println(url2.length());

        url2.replace(39, 43, "odds");


        System.out.println(url2);
    }
}
