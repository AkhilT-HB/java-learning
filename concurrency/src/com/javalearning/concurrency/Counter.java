package com.javalearning.concurrency;

public class Counter {
	
	private int i=0;
	
	public void increment(){
		i++;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	
}
