package factoryPractice;

public class UpiPayment implements Payment {

	public void pay(double amount) {
		System.out.println("Upi payment done for amount: "+amount);
	}
}
