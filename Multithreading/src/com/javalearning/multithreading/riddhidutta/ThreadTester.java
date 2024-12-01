package com.javalearning.multithreading.riddhidutta;

import java.util.Comparator;

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
		
		new Thread(()-> {
			int counter=0;
			while(++ counter < 10)
				System.out.println("Pushed"+ stack.push(100));
		},"Pusher").start();
		
		new Thread(()->{
			int counter = 0;
			while(++ counter < 10) 
				System.out.println("Popped"+stack.pop());
		},"Popper").start();
	}
	
	

}
