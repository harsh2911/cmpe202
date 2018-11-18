
/**
 * Write a description of class ScienceBookDecorator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceBookDecorator extends BookDecorator {
 
    ScienceBookDecorator(Book book) {
        super(book);
    }
 
    @Override
    public String describe() {
        return ("Science " + super.describe());
    }
}