package com.javalearning.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		int[] marks = {97,98,100};
		
		Student student = new Student("Ranga", 97,98,100);
		
		Student student1 = new Student("Adam", 97,98);
		
		Student student2 = new Student("Eve", 97,98,90,98);
		
		int number = student1.getNumberOfMarks();
		System.out.println("number of marks: "+number);
		int sum = student1.getTotalSumOfMarks();
		System.out.println("sum of marks: "+sum);
		int maximumMark = student1.getMaximumMark();
		System.out.println("maximum mark: "+maximumMark);
		int minimumMark = student1.getMinimumMark();
		System.out.println("minimum mark: "+minimumMark);
		BigDecimal average = student1.getAverageMarks();
		System.out.println("average is: "+average);
		
		System.out.println(student1);
		
		student1.addNewMark(35);
		
		System.out.println(student1);
		
		student1.removeMarkAtIndex(2);
		
		System.out.println(student1);
		
		
	}

}
