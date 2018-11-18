
/**
 * Abstract class BookDecorator - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class BookDecorator implements Book {
 
    protected Book book;
 
    BookDecorator(Book book) {
        this.book = book;
    }
 
    @Override
    public String describe() {
        return book.describe();
    }
}