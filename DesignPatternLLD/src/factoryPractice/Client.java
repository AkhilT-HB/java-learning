package factoryPractice;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment = PaymentFactory.getPayment("CREDIT");
		payment.pay(500);
	
	}

}
