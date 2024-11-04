package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StreamPracticeQuesCodeWithVarsha2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,3,4,5,6,6,8,8,101);
        int[] arr = {1,2,3,4};
        
       // Write a program to find the sum of all elements in a List using streams.
       //int output =  nums.stream().mapToInt(n->Integer.valueOf(n)).sum();
//       int sum = nums.stream().mapToInt(Integer::intValue).sum();
//       System.out.println(sum);
        
      //Given a List of integers, write a program to find the maximum element using streams.
       
//       int max = nums.stream().max(Comparator.naturalOrder()).get();
//       System.out.println(max);
//       int maximum = nums.stream().max((a,b)-> a.compareTo(b)).get();
//       System.out.println(maximum);
       
       
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

        //Given a List of strings, write a program to count the number of strings that start with a specific character using streams.
        
//        long countValue = fruits.stream().filter(str -> str.startsWith("a")).count();
//        
//        System.out.println(countValue);
        
       //Write a program to convert a List of strings to uppercase using streams.
       //fruits.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        
        
        //Given a List of integers, write a program to filter out the even numbers using streams.
        // Count the number of elements in a list that satisfy a specific condition using streams.
       
//       List<Integer> nums = Arrays.asList(1,2,3,3,4,5,6,6,8,8,101);
       
        //nums.stream().filter(n->n%2==0).forEach(System.out::println);
        
      
        
        
       //Write a program to find the average of a List of floating-point numbers using streams.
        List<Double> numsFloat = Arrays.asList(1.3, 2.4, 3.1, 4.2, 5.4);
        
        double avg = numsFloat.stream().mapToDouble(Double::valueOf).average().orElse(0.0);
        //System.out.println(avg);
       //Given a List of strings, write a program to concatenate all the strings using streams.
        //List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");
        String concatenatedString = fruits.stream().reduce((str1,str2)->str1.concat(str2)).orElse("No value");
        //System.out.println(concatenatedString);
        
       //Write a program to remove duplicate elements from a List using streams.
        //nums.stream().distinct().forEach(System.out::println);
       
        
   
        
      //Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
        List<Person> people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Anna", 29),
                new Person("Bob", 30),
                new Person("Barbie", 56),
                new Person("Charlie", 20)
        );
        
        //Sort using age
        List<Person> sortedPeople = people.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
        //System.out.println(sortedPeople);
        
        //Write a program to check if all elements in a List satisfy a given condition using streams.
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        
        //System.out.println(numbers.stream().allMatch(n->n%2==0));
        
        //Check if a list contains a specific element using streams.
        //System.out.println(numbers.stream().anyMatch(n->n%2 != 0));
        
        //Sort a list of strings in ascending order using streams.
        //fruits.stream().sorted().forEach(System.out::println);
        
        //Sort a list of strings in desc order using streams.
        //fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        
        //Create a new list containing the square of each element from the original list using streams
        List<Integer> squareOfNums = nums.stream().map(n-> n*n).collect(Collectors.toList());
        //System.out.println(squareOfNums);
        
        //Find the average length of strings in a list using streams.
        //List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");
        double averageLenghtOfFruits = fruits.stream().mapToInt(str->str.length()).average().orElse(0.0);
        //System.out.println(averageLenghtOfFruits);

        
        //Find the longest string in a list using streams.
        int longestLength = fruits.stream().map(str -> str.length()).max(Comparator.naturalOrder()).get();
        System.out.println(longestLength);
        
        
        //Remove null values from a list using streams.
        List<String> nonNullValues = fruits.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(nonNullValues);

        //Find the second smallest element in a list of integers using streams.
        int secondSmallest = nums.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
        System.out.println(secondSmallest);
  
	}

}
