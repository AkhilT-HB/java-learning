package com.javalearning.oops;

public class Student {
	
	//state
	private String collage;
	private String grade;
	
	//Creation
	public Student(String collage, String grade) {
		this.collage = collage;
		this.grade = grade;
	}
	
	//Operations
	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public String toString() {
		return String.format("Collage - %s and grade - %s", collage, grade);
	}
	

}
