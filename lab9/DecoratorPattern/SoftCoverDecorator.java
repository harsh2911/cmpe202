
/**
 * Write a description of class SoftCoverDecorator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SoftCoverDecorator extends BookDecorator {
 
    SoftCoverDecorator(Book book) {
        super(book);
    }
     
    @Override
    public String describe() {  
        return (super.describe() + " with Soft Cover");
    }
}