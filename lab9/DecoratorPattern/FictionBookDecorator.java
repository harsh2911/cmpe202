
/**
 * Write a description of class FictionBookDecorator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FictionBookDecorator extends BookDecorator {
 
    FictionBookDecorator(Book book) {
        super(book);
    }
 
    @Override
    public String describe() {
        return ("Fiction " + super.describe());
    }
}