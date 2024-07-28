package com.javalearning.oops;

import java.math.BigDecimal;

public class Employee extends Person{



	private String title;
	private String employer;
	private String employeeGrade;
	private BigDecimal salary;
	
	
	
	
	public Employee(String name, String phone, String email, String title, String employer, String employeeGrade) {
		super(name, phone, email);
		this.title = title;
		this.employer = employer;
		this.employeeGrade = employeeGrade;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getEmployer() {
		return employer;
	}




	public void setEmployer(String employer) {
		this.employer = employer;
	}




	public String getEmployeeGrade() {
		return employeeGrade;
	}




	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}




	public BigDecimal getSalary() {
		return salary;
	}




	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	
	
	public String toString() {
		return  String.format(super.toString() + "," + "Title - %s, Employer - %s, EmployeeGrade - %s, Salary - %d", title, employer,employeeGrade,salary);
	}
	

}
