package com.javalearning.oops;

public class MotorBike {
	
	private int speed;//member variable
	
	MotorBike(int speed){
		this.speed=speed;
	}
	
	MotorBike(){
		
	}
	
	void setSpeed(int speed) { //local variable
		//System.out.println("local variable speed = " + speed);
		//System.out.println("member variable speed = " + this.speed);
		this.speed=speed;
		//System.out.println(this.speed);
	}
	
	int getSpeed() {
		return this.speed;
	}
	
	void startBike() {
		System.out.println("Bike Started");
	}

}
