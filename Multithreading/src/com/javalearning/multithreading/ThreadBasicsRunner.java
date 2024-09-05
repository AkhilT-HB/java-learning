package com.javalearning.multithreading;


class Task1 extends Thread{
	public void run() {//SIGNATURE
		System.out.println("\nTask1 Started");
		for(int i=101;i<=199;i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for(int i=201;i<=299;i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Done");
	}
	
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//task1
		System.out.print("\nTask1 KickedOff");
		Task1 task1 = new Task1();
		task1.setPriority(10);
		task1.start();
		
		//task2
		System.out.print("\nTask2 KickedOff");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(1);
		task2Thread.start();
		
		
		task1.join();
		task2Thread.join();
				
		//task3
		System.out.print("\nTask3 KickedOff");
		for(int i=301;i<=399;i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
	}

}
