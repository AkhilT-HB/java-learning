package com.javalearning.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> characters =  List.of('A','Z','A','B','Z','F');
		
		//ques - list out the unique characters in sorted order and insertion order
		// We can use set
		// there are 3 sets available - HashSet, LinkedHashSet, TreeSet
		
		Set<Character> treeSet = new TreeSet<Character>(characters);
		System.out.println("TreeSet "+treeSet);
		
		Set<Character> linkedHashSet = new LinkedHashSet<Character>(characters);
		System.out.println("linkedHashSet "+linkedHashSet);
		
		Set<Character> hashSet = new HashSet<Character>(characters);
		System.out.println("hashSet "+hashSet);
		
	}

}
