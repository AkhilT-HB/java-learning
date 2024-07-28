package com.javalearning.oops;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address homeAdd = new Address("Line1","Bengaluru","5555");
		
		Customer customer = new Customer("Ramesh",homeAdd);
		
		System.out.println(customer);
		
		Address workAdd = new Address("line1Work", "Bengaluru", "5556");
		customer.setWorkAddress(workAdd);
		
		System.out.println(customer);
	}

}
