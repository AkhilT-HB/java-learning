package com.javalearnings.interfaces;

interface Flyable {
	void fly();
}

class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("with wings");
		
	}
	
}

class Aeroplane implements Flyable{

	@Override
	public void fly() {
		System.out.println("with fuel");
	}
	
}


public class FlyableInterfaceRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Aeroplane(), new Bird()};
		
		for(Flyable flyObjects : flyingObjects) {
			flyObjects.fly();
		}
		
	}

}
