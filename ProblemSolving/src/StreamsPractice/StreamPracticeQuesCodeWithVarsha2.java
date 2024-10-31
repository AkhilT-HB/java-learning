package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
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
        
        long countValue = fruits.stream().filter(str -> str.startsWith("a")).count();
        
        System.out.println(countValue);
        
       //Write a program to convert a List of strings to uppercase using streams.
      
        
        
        //Given a List of integers, write a program to filter out the even numbers using streams.
        // Count the number of elements in a list that satisfy a specific condition using streams.
        
      
        
        
       //Write a program to find the average of a List of floating-point numbers using streams.
   
        
       //Given a List of strings, write a program to concatenate all the strings using streams.
        //List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");
      
        
       //Write a program to remove duplicate elements from a List using streams.
  
       
        
   
        
      //Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
        List<Person> people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Anna", 29),
                new Person("Bob", 30),
                new Person("Barbie", 56),
                new Person("Charlie", 20)
        );
        
        //Sort using age

        
        //Write a program to check if all elements in a List satisfy a given condition using streams.
       
        
        //Check if a list contains a specific element using streams.
   
        
        //Sort a list of strings in ascending order using streams.
   
        
        //Sort a list of strings in desc order using streams.

        
        
        //Create a new list containing the square of each element from the original list using streams

        
        
        //Find the average length of strings in a list using streams.

        
        //Find the average length of strings in a list using streams.

        
        //Find the longest string in a list using streams.

        
        //Remove null values from a list using streams.



        //Find the second smallest element in a list of integers using streams.
   
        
  
	}

}
