package com.javalearning.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {
	
	static <X> X doSomething(X value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value3 = doSomething(new String());
		Integer num3 = doSomething(Integer.valueOf(5));
		ArrayList list3 = doSomething(new ArrayList());
		
		
		ArrayList<Integer> nums2 = new ArrayList<>(List.of(1,2,3));
		duplicate(nums2);
		System.out.println(nums2);
		
		
		MyCustomList<String> list = new MyCustomList<>();		
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(1);
		
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		Integer num = list2.get(0);
		
		System.out.println(num);
	}

}
