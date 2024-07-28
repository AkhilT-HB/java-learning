package com.javalearning.oops;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyChar myChar = new MyChar('A');
		
		System.out.println(myChar.isVowel());
		
		System.out.println(myChar.isDigit());
		
		System.out.println(myChar.isAlphabet());
		
		System.out.println(myChar.isConsonant());
		
		//MyChar.printLowerAlphabets();
		MyChar.printUpperAlphabets();

	}

}
