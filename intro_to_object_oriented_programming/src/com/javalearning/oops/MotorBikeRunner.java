package com.javalearning.oops;

public class MotorBikeRunner {
	
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(75);
		MotorBike honda = new MotorBike(90);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
	
		
		ducati.startBike();
		honda.startBike();
		
		//ducati.setSpeed(100);
		//honda.setSpeed(20);
		
		//System.out.println(ducati.getSpeed()); 
		//System.out.println(honda.getSpeed());
	}

}
