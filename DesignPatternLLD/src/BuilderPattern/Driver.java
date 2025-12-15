package builderPattern;

public class Driver {

	public static void main(String[] args) {
		
		Dog dog1 = Dog.builder()
				.setName("Bruno")
				.setBreed("Lab")
				.setGender("Male")
				.setPrice(12.20)
				.build();
		
		Dog dog2 = Dog.builder()
				.setBreed("German")
				.setGender("Male")
				.setPrice(12.20)
				.build();
		
		System.out.println(dog1);
		System.out.println(dog2);
		
	}

}
