package com.javalearning.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		
		List<Student> studentsAl = new ArrayList<Student>(students);
		
		System.out.println(studentsAl);
		
		Collections.sort(studentsAl);
		
		System.out.println(studentsAl);
	
		studentsAl.sort(new AscStudentComparator());
		
		System.out.println(studentsAl);

	}

}
