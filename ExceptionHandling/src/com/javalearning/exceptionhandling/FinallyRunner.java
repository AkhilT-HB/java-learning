package com.javalearning.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);

			int[] numbers = { 1, 2, 3, 4 };

			int number = numbers[5];
			System.out.println("Before scanner close");

			

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Inside finally");
			if(scanner!=null) {
			scanner.close();
			}
		}
		
		System.out.println("Just before main closes");

	}

}
