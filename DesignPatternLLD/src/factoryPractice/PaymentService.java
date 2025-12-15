package factoryPractice;

public class PaymentService {
	public void pay(String type) {
        if (type.equals("CREDIT")) {
            CreditCardPayment credit = new CreditCardPayment();
            credit.pay();
        } else if (type.equals("UPI")) {
            UpiPayment upi = new UpiPayment();
            upi.pay();
        } else if(type.equals("NET")) {
        	NetBankingPayment net = new NetBankingPayment();
        	net.pay();
        }
    }


}
