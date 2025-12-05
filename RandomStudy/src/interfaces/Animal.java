package interfaces;

public interface Animal {
	public static final int MAX_AGE = 150;
	
	void eat();
	
	void sleep();
	
	static void info() {
		System.out.println("This is Animal interface");
	}
	
	default void run() {
		this.eat();
		System.out.println("Animal interface is running");
	}
}
