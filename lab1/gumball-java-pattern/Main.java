

public class Main {

    public static void main(String[] args) {
        System.out.println("Gumball Machine 1 which only accepets a Quater and price of Gumball is 25");
        GumballMachine gumballMachine = new GumballMachine(5, 25, "Quater");

        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println("\nGumball Machine 2 which only accepets a Quater and price of Gumball is 50");
        GumballMachine gumballMachine1 = new GumballMachine(5, 50, "Quater");

        gumballMachine1.insertCoin(10);
        gumballMachine1.turnCrank();
        gumballMachine1.insertCoin(25);
        gumballMachine1.turnCrank();
        gumballMachine1.insertCoin(25);
        gumballMachine1.turnCrank();
        
        System.out.println("\nGumball Machine 3 which only accepets all type of coins and price of Gumball is 50");
        GumballMachine gumballMachine2 = new GumballMachine(5, 50, "All");

        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(5);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(10);
        gumballMachine2.insertCoin(10);
        gumballMachine2.turnCrank();
    }
}
