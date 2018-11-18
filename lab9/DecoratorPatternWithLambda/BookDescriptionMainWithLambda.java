
/**
 * Write a description of class BookDescriptionMainWithLambda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.List;
import java.util.ArrayList;
 
public class BookDescriptionMainWithLambda {
     
    public static void main(String [] args) {
         
        BasicBook book = new BasicBook();
         
        //Specify book as Fiction category using Lambda expression
        Book fictionBook = () -> "Fiction " + book.describe();
         
        //Specify that the book has a hard cover using Lambda expression
        Book hardCoverBook = () -> book.describe() + " with Hard Cover";
         
        //What if we want to specify both the category and cover type together
        Book hardCoverFictionBook = () -> fictionBook.describe() + " with Hard Cover";               
         
        //Specify book as Science category using Lambda expression
        Book scienceBook = () -> "Science " + book.describe();
         
        //What if we want to specify both the category and cover type together
        Book hardCoverScienceBook = () -> fictionBook.describe() + " with Hard Cover";               
 
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
         
        bookList.forEach(b -> System.out.println(b.describe()));
    }
}