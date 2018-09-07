
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int priceOfGumball;
    private String allowedCoins;
    private int totalOfCoins;

    public GumballMachine( int size,  int price, String type)
    {
        // initialise instance variables
        this.num_gumballs = size; //total gumballs in a machine
        this.has_quarter = false;
        this.priceOfGumball = price;
        this.allowedCoins = type;
        this.totalOfCoins = 0;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25){
            this.has_quarter = true ;
            this.totalOfCoins = this.totalOfCoins + coin;
        }else{
            this.has_quarter = false ;
            if(this.allowedCoins.equals("Quater"))
                System.out.println("Coin ejected. Please enter a quater");
            else
                this.totalOfCoins = this.totalOfCoins + coin;
        }
    }
    
    public void turnCrank()
    {
        if ( this.totalOfCoins >= this.priceOfGumball)
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                this.totalOfCoins = this.totalOfCoins - this.priceOfGumball;
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert more coin" ) ;
        }        
    }
}
