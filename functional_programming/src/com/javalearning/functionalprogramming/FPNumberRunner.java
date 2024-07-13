package com.javalearning.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		
		//numbers.stream().forEach(element->System.out.println(element));
		
		int sum=numbers.stream().reduce(0,(number1,number2)->number1+number2);
		
		int oddSum=numbers.stream().filter(element->element%2==1)
				.reduce(0,(number1,number2)->number1+number2);
		
		System.out.println(oddSum);
	}

}
