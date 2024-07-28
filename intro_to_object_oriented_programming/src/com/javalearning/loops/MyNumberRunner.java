package com.javalearning.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		
		boolean isPrime = number.isPrime();
		System.out.println("isPrime = "+isPrime);
		
		int sum = number.sumUptoN();
		System.out.println("The sum is "+sum);
		
		int sumOfDivisor = number.sumOfDivisor();
		System.out.println("The sumOfDivisor is "+sumOfDivisor);
		
		number.printNumberTriangle();
	}

}
