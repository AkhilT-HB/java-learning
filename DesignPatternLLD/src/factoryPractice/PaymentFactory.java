package factoryPractice;

public class PaymentFactory {
	public static Payment getPayment(String type) {
        if (type.equals("CREDIT")) {
            return new CreditCardPayment();
        } else if (type.equals("UPI")) {
            return new UpiPayment();
        } else if(type.equals("NET")) {
        	return new NetBankingPayment();
        }
        
        throw new IllegalArgumentException("Invalid payment type");
    }
}
