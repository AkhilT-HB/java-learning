package com.javalearning.functionalprogramming;

import java.util.List;

public class MethodReferenceRunner {
	
	
	public static void print(Integer num) {
		System.out.println(num);
	}
	
	public static boolean isEven(Integer num) {
		return num%2==0;
	}

	public static void main(String[] args) {
		List.of("Ant","Bat","Cat","Elephant").stream()
				.map(s->s.length())
				.forEach(l->System.out.println(l));
		
		List.of("Ant","Bat","Cat","Elephant").stream()
				.map(String::length)
				.forEach(System.out::println);
		
		List.of("Ant","Bat","Cat","Elephant").stream()
		.map(String::length)
		.forEach(MethodReferenceRunner::print);
		
		Integer max = List.of(23, 45, 67, 34).stream()
				.filter(n->n%2==0)
				.max((n1,n2)->Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max);
		
		Integer max2 = List.of(23, 45, 67, 34).stream()
				.filter(MethodReferenceRunner::isEven)
				.max(Integer::compare)
				.orElse(0);
		System.out.println(max2);
	}

}
