
public class Client {

	public static void runTest() {
		Component theOrder = BuildOrder.getOrder();
		theOrder.printDescription();

		System.out.println();
		System.out.println();

		Component theOrder2 = BuildOrder.getOrderTwo();
		theOrder2.printDescription();
	}

	public static void main(String[] args) {
		runTest();
	}

}
