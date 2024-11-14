package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPracticeQuesCodeWithVarshaPart2 {

	public static void main(String[] args) {

		// 1. Given a sentence, find and print the frequency of each word.
		String sentence = "Java is a programming language. Java is versatile.";

		Map<Object, Long> wordFrequency = Arrays.stream(sentence.split("\\s+"))
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
		// System.out.println(wordFrequency);

		// 2. Given a list of integers, find out all the numbers starting with 1.
		List<Integer> nums = Arrays.asList(12, 13, 18, 21, 90, 11);
		// nums.stream().map(e -> e+" ").filter(e ->
		// e.startsWith("1")).forEach(System.out::println);
		// Another approach
		// List<Integer> numsWithOne = nums.stream().filter( n ->
		// String.valueOf(n).startsWith("1")).collect(Collectors.toList());

		// 3. Given a list of names, group them by their first letter, and then count
		// the number of names in each group.
		String[] names = { "Alice", "Bob", "Charlie", "Amy", "Bill", "Anna" };

		Map<String, Long> output = Arrays.stream(names)
				.collect(Collectors.groupingBy(str -> str.substring(0, 1), Collectors.counting()));
		// System.out.println(output);

		// 4. Find and print duplicate numbers in an array if it contains multiple
		// duplicates?
		int[] arr = { 2, 4, 2, 3, 1, 5, 5, 78, 3, 1, 5 };

//        Arrays.stream(arr).boxed()
//        					.collect(Collectors.groupingBy(Integer::valueOf,Collectors.counting()))
//        					.entrySet()
//        					.stream()
//        					.filter(es -> es.getValue()>1)
//        					.map(es -> es.getKey())
//        					.forEach(System.out::println);;

//        Arrays.stream(arr).boxed()
//        		.collect(Collectors.groupingBy(e->e, Collectors.counting()))
//        		.entrySet().stream().filter(entry -> entry.getValue()>1)
//        		.map(entry -> entry.getKey())
//        		.forEach(System.out::println);

		// 6. Given a list of words, filter and print the palindromes

		List<String> strings = List.of("level", "hello", "radar", "world", "deed");

//		strings.stream().filter(str -> str.equals(new StringBuilder(str).reverse().toString()))
//				.forEach(System.out::println);

		// 7. How do you merge two sorted arrays into a single sorted array?
		int[] array1 = { 1, 3, 32, 5, 7 };
		int[] array2 = { 2, 4, 6, 62, 8 };
		
		int[] concatedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
		
		//System.out.println(Arrays.toString(concatedArray));
		
		
        //8. Given two lists of strings, concatenate them and remove duplicates.
        List<String> list1 = List.of("apple", "banana", "orange");
        List<String> list2 = List.of("banana", "kiwi", "grape");
        
        //Stream.concat(list1.stream(), list2.stream()).distinct().forEach(System.out::println);
        
        
        // 9. Student Grade Classification - 70 and above pass

        List<Student> students = List.of(
                new Student("Alice", 85),
                new Student("Bob", 60),
                new Student("Charlie", 75),
                new Student("David", 90)
        );
        
        Map<String, List<Student>> studentMap = students.stream()
        		.collect(Collectors.groupingBy(student -> student.getGrade() >= 70 ? "Pass" : "Fail"));

        //System.out.println(studentMap);
        
        
        //10. Given a list of strings, sort them according to increasing order of their length.

        List<String> fruits = Arrays.asList("Mango","pear" ,"Apple", "Banana", "Pineapple", "Kiwi");
        
        fruits.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        
        
	}

}
