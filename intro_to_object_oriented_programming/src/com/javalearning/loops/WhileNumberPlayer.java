package com.javalearning.loops;

public class WhileNumberPlayer {
	
	int limit=0;
	
	WhileNumberPlayer(int limit){
		this.limit=limit;
	}
	
	
	
	void printSquaresUptoLimit() {
		int i=0;
		
		while(i*i<limit) {
			System.out.print(i*i+" ");
			i++;
		}
		System.out.println();
	}
	

	void printCubesUptoLimit() {
		int i=0;
		
		while(i*i*i<limit) {
			System.out.print(i*i*i+" ");
			i++;
		}
	}
}
