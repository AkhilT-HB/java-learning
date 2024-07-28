package com.javalearning.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book();
		
		Book effectiveJava = new Book(100);
		
		Book cleanCode = new Book(200);
		
		artOfComputerProgramming.setNoOfCopies(178);
		
		artOfComputerProgramming.getNoOfCopies();
		effectiveJava.getNoOfCopies();
		cleanCode.getNoOfCopies();

	}

}
