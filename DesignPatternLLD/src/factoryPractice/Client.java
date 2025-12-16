package factoryPractice;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentFactory factory = new NetBankingPaymentFactory();
		Payment payment = factory.createPayment();
		
		payment.pay(120.0);
	
	}

}
