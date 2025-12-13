package BuilderPattern;
// Ensure the below patterns 
// -- private fields in main class
// -- static inner builder class
// -- constructor that accepts builder
// -- setter apis in builder
// -- build method with required checks and to return the main class object
// -- setters(private) & getters not necessary in main class
// -- getters not necessary in builder class
// -- have static factory builder() method for Builder in main class(cleaner and hides inner class when driver/client uses objects)

public class Dog {
	
	private String name;
	private String gender;
	private String breed;
	private double price;//optional
	
	public Dog(DogBuilder builder) {
		this.name = builder.name;
		this.gender = builder.gender;
		this.breed = builder.breed;
		this.price = builder.price;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}


	public String getBreed() {
		return breed;
	}


	public double getPrice() {
		return price;
	}
	
	public static DogBuilder builder() {
		return new DogBuilder();
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + this.name + ", gender=" + this.gender + ", breed=" + this.breed + ", price=" + this.price + "]";
	}



	public static class DogBuilder{
		private String name;//optional
		private String gender;//required
		private String breed;//required
		private double price;//optional
		
		public DogBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public DogBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}

		public DogBuilder setBreed(String breed) {
			this.breed = breed;
			return this;
		}

		public DogBuilder setPrice(double price) {
			this.price = price;
			return this;
		}
		
		public Dog build() {
			if(breed==null || gender==null) {
				throw new IllegalStateException("Breed and Gender are required");
			}
			return new Dog(this);
		}
		
		
	}
	

}
