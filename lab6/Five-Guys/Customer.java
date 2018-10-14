  
import java.text.DecimalFormat;

public class Customer {

    public static void main(String[] args)
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        double totalPrice = 0;
        Component customerReceipt, packingSlip;
        CustomerReceipt cp = new CustomerReceipt();
        customerReceipt = cp.printingSequence() ;
        customerReceipt.printDescription();
        totalPrice = customerReceipt.getPrice();
        System.out.println("Total Price: "+ fmt.format(totalPrice));
        
        System.out.println("\n\n");
        PackingReceipt ps = new PackingReceipt();
        packingSlip = ps.printingSequence() ;
        packingSlip.printDescription();
        


    }
}
 
