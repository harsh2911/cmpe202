

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
    System.out.println("You inserted a coin");
	if(!this.gumballMachine.allowedCoins.equals("All") && coin != 25) {
		System.out.println("Sorry! Only quarters accepted.");
	} else {
		if(coin >= this.gumballMachine.price) {
			gumballMachine.setState(gumballMachine.getHasCoinState());
			gumballMachine.sum += coin;
		} else {
		        gumballMachine.sum += coin;
			gumballMachine.setState(gumballMachine.getHasLessCoinState());
				
		}
	}    
            
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no coins");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
