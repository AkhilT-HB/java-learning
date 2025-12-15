package factoryPractice;

public class NetBankingPayment implements Payment {

	public void pay(double amount) {
		System.out.println("Net banking payment done for amount: "+amount);
	}
}
