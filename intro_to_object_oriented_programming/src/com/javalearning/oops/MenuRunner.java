package com.javalearning.oops;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int number1 = scan.nextInt();
		System.out.println("The number you entered is: "+number1);
		
		System.out.print("Enter number2: ");
		int number2 = scan.nextInt();
		System.out.println("The number you entered is: "+number2);
		
		System.out.println("1.Add");
		System.out.println("2.Substract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		
		System.out.println("Choose your option: ");
		int option = scan.nextInt();
		
		performOperationUsingNestedIfElse(number1, number2, option);
		
		performOperationUsingSwitch(number1, number2, option);
		
	}

	private static void performOperationUsingNestedIfElse(int number1, int number2, int option) {
		if(option==1) {
			System.out.println("Sum is: "+(number1+number2));
		} else if (option==2) {
			System.out.println("Difference is: "+(number1-number2));
		} else if (option==3) {
			System.out.println("Product is: "+(number1*number2));
		} else if (option==4){
			System.out.println("Division is: "+(number1/number2));
		}else {
			System.out.println("Invalid operation");
		}
	}
	private static void performOperationUsingSwitch(int number1, int number2, int option) {
		switch(option) {
		case 1 : System.out.println("Sum is: "+(number1+number2));break;
		case 2 : System.out.println("Difference is: "+(number1-number2));break;
		case 3 : System.out.println("Product is: "+(number1*number2));break;
		case 4 : System.out.println("Division is: "+(number1/number2));break;
		default :System.out.println("Invalid operation");break;
		}
	}

}
