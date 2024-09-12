package equalsAndHashcode;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		
		Human a1 = new Human(1,"a1");
		Human a2 = new Human(2,"a2");
		
		a1=a2;
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("See you");
		String str4 = new String("See you");
		
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		
//		System.out.println(a1==a2);
//		System.out.println(a1.equals(a2));
//		System.out.println(a1.equals(a2));
		
///		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
//		
//		System.out.println(str3 == str4);
//		System.out.println(str3.equals(str3));
		
		Employee e1 = new Employee(1,"Apple");
		Employee e2 = new Employee(1,"Samsung");
		
		System.out.println("Shallow compare: " + (e1 == e2));
		
		System.out.println("Deep compare: " + e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
		//ArrayList<Integer> list = new ArrayList<>();
		
	}

}
