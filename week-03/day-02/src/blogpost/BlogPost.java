/*Create a BlogPost class that has
    an authorName
    a title
    a text
    a publicationDate
*/

package blogpost;

public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public String giveFullPost(){
    return title + " by " + authorName + " posted at " + publicationDate + " the following:  " + text;
  }
}
