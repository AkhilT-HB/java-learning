package com.javalearning.exceptionhandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		
		method1();
		System.out.println("Main ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 ended");
	}

	private static void method2() {
		try {
//			String str = null;
//			str.length();
			int[] nums = {1,2};
			int number = nums[2];
			System.out.println("Method2 ended");
		}catch (NullPointerException ex) {
			System.out.println("Matching NullPointerException");
			ex.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matching ArrayOutOfBoundsException");
			ex.printStackTrace();
		}
		catch (Exception ex) {
			System.out.println("Matching Exception");
			ex.printStackTrace();
		}
	}

}
