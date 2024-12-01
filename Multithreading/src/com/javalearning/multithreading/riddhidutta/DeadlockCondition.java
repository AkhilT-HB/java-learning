package com.javalearning.multithreading.riddhidutta;

public class DeadlockCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lock1 = "lock1";
		String lock2 = "lock2";
		
		Thread thread1 = new Thread(() -> {
			synchronized(lock1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(lock2) {
					System.out.println("lock2 acquired");
				}
			}
		}, "thread1");
		
		Thread thread2 = new Thread(()->{
			synchronized(lock2) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				synchronized(lock1) {
					System.out.println("lock1 acquired");
				}
			}
		}, "thread2");
		
		thread1.start();
		thread2.start();
	}

}
