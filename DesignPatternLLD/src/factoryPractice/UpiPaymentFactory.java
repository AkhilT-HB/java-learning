package factoryPractice;

public class UpiPaymentFactory implements PaymentFactory{

	@Override
	public Payment createPayment() {
		return new UpiPayment();
	}

}
