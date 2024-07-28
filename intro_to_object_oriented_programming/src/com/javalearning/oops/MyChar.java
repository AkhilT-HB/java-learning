package com.javalearning.oops;

public class MyChar {
	
	private char ch;
	
	public MyChar(char ch) {
		this.ch=ch;
	}
	
	public boolean isVowel() {
		if( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}else if( ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			return true;
		}else {
			return false;
		}
	}

	public boolean isDigit() {
		if(ch>=48 && ch<=57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
		return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if(isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public static void printLowerAlphabets() {
		for(int ch=97;ch<=122;ch++) {
			System.out.println((char)ch);
		}
	}

	public static void printUpperAlphabets() {
		for(int ch=65;ch<=90;ch++) {
			System.out.println((char)ch);
		}
	}
	
}
