package com.javalearning.oops;

public class Person {
	
	//state
	private String name;
	private String phone;
	private String email;

	//Creation
	public Person(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	//Operations
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return String.format("Name - %s, Phone - %s, Email - %s", name, phone, email);
	}

	

}
