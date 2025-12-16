package factoryPractice;

public class CreditCardPaymentFactory implements PaymentFactory{

	@Override
	public Payment createPayment() {
		Payment payment = new CreditCardPayment();
		return payment;
	}

}
