package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		Student s1 = new Student(101, "Basant");
		Student s2 = new Student(109, "Santosh");
		Student s3 = new Student(105, "Prakash");
		Student s4 = new Student(102, "Arpit");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		Collections.sort(students, new NameComparator());
		
		System.out.println(students);
	}

}
