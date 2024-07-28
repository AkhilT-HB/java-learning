package com.javalearning.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
		int number=0;
		
		do {
			if(number>=0) {
			System.out.println("Cube is "+(number*number*number));
			System.out.println("Enter a number: ");
			number = scan.nextInt();
			}
		}while(number>=0);
		System.out.println("Thank you, have fun!");
			

	}

}
