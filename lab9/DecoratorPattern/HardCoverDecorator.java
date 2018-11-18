
/**
 * Write a description of class HardCoverDecorator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardCoverDecorator extends BookDecorator {
     
    HardCoverDecorator(Book book) {
        super(book);
    }
     
    @Override
    public String describe() {  
        return (super.describe() + " with Hard Cover");
    }
}