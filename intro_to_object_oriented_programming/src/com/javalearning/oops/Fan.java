package com.javalearning.oops;

public class Fan {
	
	//State
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed;
	
	
	//Creation
	public Fan(String make, double radius, String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	//changing behaviour of a object
	
	public void switchOn() {
		this.isOn=true;
	}
	
	public void switchOff() {
		this.isOn=false;
		setSpeed((byte)0);
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	//print the state (providing the string representation of an object)
	public String toString() {
		return String.format("make- %s, radius- %f, color- %s, isOn- %b, Speed- %d", make, radius, color, isOn, speed);
	}
	

}
