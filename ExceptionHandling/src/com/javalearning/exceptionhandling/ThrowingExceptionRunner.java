package com.javalearning.exceptionhandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {
			//throw new Exception("Currencies don't match " + this.currency + " & " + that.currency);
			// System.out.println("not match");
			throw new CurrenciesDoNotMatchException("Currencies don't match " + this.currency + " & " + that.currency);
		}

		this.amount = (this.amount + that.amount);
	}

	public String toString() {
		return this.amount + " " + this.currency;
	}

}

class CurrenciesDoNotMatchException extends Exception{
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws Exception {
		Amount amt1 = new Amount("USD", 20);
		Amount amt2 = new Amount("EUR", 10);

		amt1.add(amt2);

		System.out.println(amt1);
	}

}
