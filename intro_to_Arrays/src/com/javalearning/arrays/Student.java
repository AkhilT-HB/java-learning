package com.javalearning.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

	public Student(String name, int... listOfMarks) {
		this.name = name;

		for (Integer mark : listOfMarks) {
			this.listOfMarks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		int numberOfMarks = listOfMarks.size();
		return numberOfMarks;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : listOfMarks) {
			sum = sum + mark;
		}
		return sum;
	}
	
	public int getMaximumMark() {
		return Collections.max(listOfMarks);
	}

//	public int getMaximumMark() {
//		int maxMark = Integer.MIN_VALUE;
//		for (int mark : listOfMarks) {
//			if (mark > maxMark) {
//				maxMark = mark;
//			}
//		}
//		return maxMark;
//	}
	
	public int getMinimumMark() {
		return Collections.min(listOfMarks);
	}
	
//	public int getMinimumMark() {
//		int minMark = Integer.MAX_VALUE;
//		for (int mark : listOfMarks) {
//
//			if (mark < minMark) {
//				minMark = mark;
//			}
//		}
//		return minMark;
//	}

	public BigDecimal getAverageMarks() {
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		BigDecimal number = new BigDecimal(getNumberOfMarks());

		BigDecimal average = sum.divide(number, 3, RoundingMode.UP);
		return average;
	}
	
	void addNewMark(int mark) {
		listOfMarks.add(mark);
	}
	
	void removeMarkAtIndex(int index) {
		listOfMarks.remove(index);
	}
	
	public String toString() {
		return name + listOfMarks;
	}

}
