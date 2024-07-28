package com.javalearnings.interfaces;

abstract class Animal{
	abstract void bark();
}

class Dog extends Animal{
	@Override
	void bark() {
		System.out.println("Bow bow");
	}
}

class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("Meow Meow");
	}
}



public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal[] animals = {new Dog(),new Cat()};
		
		for(Animal animal:animals) {
			animal.bark();
		}
		
	}

}
