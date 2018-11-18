
/**
 * Write a description of class BookDescriptionMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
 
public class BookDescriptionMain {
     
    public static void main(String [] args) {
         
        BasicBook book = new BasicBook();
         
        //Specify book as Fiction category
        FictionBookDecorator fictionBook = new FictionBookDecorator(book);
         
        //Specify that the book has a hard cover
        HardCoverDecorator hardCoverBook = new HardCoverDecorator(book);
         
        //What if we want to specify both the category and cover type together
        HardCoverDecorator hardCoverFictionBook = new HardCoverDecorator(fictionBook);              
         
        //Specify book as Science category
        ScienceBookDecorator scienceBook = new ScienceBookDecorator(book);
         
        //What if we want to specify both the category and cover type together
        HardCoverDecorator hardCoverScienceBook = new HardCoverDecorator(scienceBook);              
 
        //Add all the decorated book items in a list
        List<Book> bookList = new ArrayList<Book>() {
            {
                add(book);
                add(fictionBook);
                add(hardCoverBook);
                add(hardCoverFictionBook);
                add(scienceBook);
                add(hardCoverScienceBook);
            }
        };
         
        //Traverse the list to access all the book items
        for(Book b: bookList) {
            System.out.println(b.describe());
        }       
    }
}