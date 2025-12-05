package interfaces;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.eat();
		dog.sleep();
		
		System.out.println(Dog.MAX_AGE);
		System.out.println(Animal.MAX_AGE);
		
		Animal.info();
		
		dog.run();
	}

}
