package com.javalearning.oops;

public class Book {
	
	private int noOfCopies;//memberVariable
	
	Book(int noOfCopies){
		this.noOfCopies=noOfCopies;
	}
	
	Book(){
		
	}
	
	void setNoOfCopies(int noOfCopies) {//localVariable
		this.noOfCopies=noOfCopies; //this.memberVariable=localVariable
		//System.out.println("the no of copies = "+this.noOfCopies);
	}
	
	void getNoOfCopies() {
		System.out.println(noOfCopies);
	}
	
	public void increaseNumberOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}
	
	public void decreaseNumberOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
	
}
