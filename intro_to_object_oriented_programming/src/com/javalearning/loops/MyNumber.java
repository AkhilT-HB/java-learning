package com.javalearning.loops;

public class MyNumber {
	private int num;
	
	public MyNumber(int num){
		this.num=num;
	}
	
	boolean isPrime() {
		if(num<2) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	int sumUptoN() {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}
	
	void printNumberTriangle() {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

	public int sumOfDivisor() {
		int sumOfDiv=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				sumOfDiv=sumOfDiv+i;
			}
		}
		return sumOfDiv;
	}
	
}
