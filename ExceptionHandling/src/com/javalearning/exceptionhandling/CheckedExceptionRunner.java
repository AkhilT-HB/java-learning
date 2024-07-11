package com.javalearning.exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		/*try {
			//System.out.println("sleep done");
			someOtherMethod();
			Thread.sleep(2000);
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		//someOtherMethod();
		
		someOtherMethod2();
		
	}
	private static void someOtherMethod() throws InterruptedException {
		Thread.sleep(2000);
		
	}
	
	private static void someOtherMethod2() throws RuntimeException {

		
	}
	
	

}
