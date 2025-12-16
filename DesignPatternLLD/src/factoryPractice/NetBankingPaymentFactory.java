package factoryPractice;

public class NetBankingPaymentFactory implements PaymentFactory{

	@Override
	public Payment createPayment() {
		return new NetBankingPayment();
	}

}
