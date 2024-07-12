package com.javalearning.firstjavaproject;

public class MultiplicationTable {
	
	void printTable() {
		printTable(5);
//		for(int i=1;i<=10;i++) {
//			System.out.printf("%d * %d = %d",5,i,5*i).println();
//		}
	}
	
	void printTable(int table) {
		printTable(table,1,10);
//		for(int i=1;i<=10;i++) {
//			System.out.printf("%d * %d = %d",table,i,table*i).println();
//		}
	}
	
	void printTable(int table, int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.printf("%d * %d = %d",table,i,table*i).println();
		}
	}
	
}
