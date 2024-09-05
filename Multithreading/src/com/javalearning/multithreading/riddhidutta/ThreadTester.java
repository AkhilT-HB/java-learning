package com.javalearning.multithreading.riddhidutta;

public class ThreadTester {

	public static void main(String[] args) {
		
		System.out.println("main is starting");
//		Thread thread1 = new Thread1("thread1");
//		thread1.start();
		
		
		Thread thread2 = new Thread(()-> {for(int i=0;i<5;i++) {
			System.out.println("inside "+Thread.currentThread());
		}},"thread2");
		thread2.start();
		
		System.out.println("main is exiting");
		
		Stack stack = new Stack(5);
	}

}
