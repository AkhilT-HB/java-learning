package factoryPractice;

public class CreditCardPayment implements Payment {
	public void pay(double amount) {
		System.out.println("Credit card payment done for amount: "+amount);
	}
}
