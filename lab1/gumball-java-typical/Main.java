

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5, 25, "Quater");

        System.out.println("Gumball Machine 1 - 25 cent - only quaters");    
        
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 10 );
        gumballMachine.turnCrank();        
        
        System.out.println();
        System.out.println("Gumball Machine 2 - 50 cent - only quaters");        
        GumballMachine gumballMachine2 = new GumballMachine(5, 50, "Quater");
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.turnCrank();
        gumballMachine2.insertQuarter( 25 );
        gumballMachine2.insertQuarter( 10 );
        gumballMachine2.turnCrank();
        
        System.out.println();
        System.out.println("Gumball Machine 3 - 50 cent - Any coins");        
        GumballMachine gumballMachine3 = new GumballMachine(5, 50, "Any");

        gumballMachine3.insertQuarter( 25 );
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 10 );
        gumballMachine3.insertQuarter( 5 );
        gumballMachine3.turnCrank();
    }
}
