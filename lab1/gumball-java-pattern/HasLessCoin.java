
public class HasLessCoin implements State
{
     GumballMachine gumballMachine;
 
    public HasLessCoin(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        System.out.println("You inserted a coin");
		if(!gumballMachine.allowedCoins.equals("All") && coin != 25) {
			System.out.println("Sorry! Only quarters accepted.");
		} else {
			if(coin >= gumballMachine.price) {
				gumballMachine.setState(gumballMachine.getHasCoinState());
			} else {
				gumballMachine.sum += coin;
				if(gumballMachine.sum >= gumballMachine.price) {
					gumballMachine.setState(gumballMachine.getHasCoinState());
				} else {
					gumballMachine.setState(gumballMachine.getHasLessCoinState());
				}
			}
		}
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but you need to add more coin");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
