package com.javalearning.oops;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan fan = new Fan("Manufacturer1",0.3456,"Green");
		
		fan.switchOn();
		fan.setSpeed((byte)2);
		
		System.out.println(fan);
		
		fan.switchOff();
		//fan.setSpeed((byte)0);
		
		System.out.println(fan);
		
	}

}
