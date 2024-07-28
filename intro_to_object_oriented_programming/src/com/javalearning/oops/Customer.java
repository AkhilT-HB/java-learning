package com.javalearning.oops;

public class Customer {
	
	//state
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	//creation
	public Customer(String name, Address homeAddress){
		this.name=name;
		this.homeAddress=homeAddress;
	}
	
	//Operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	//toString
	public String toString() {
		return String.format("Customer name is %s and homeAddress is [%s] and workAddress is [%s]", name,homeAddress,workAddress);
	}
	
}
