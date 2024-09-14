package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPracticeQuesCodeWithVarsha {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,3,4,5,6,6,8,8,101);
        int[] arr = {1,2,3,4};
        
       // Write a program to find the sum of all elements in a List using streams.
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        /*my try
        Optional<Integer> sum =nums.stream().reduce((a,b)-> a+b);
        if(sum.isPresent()) {
        	System.out.println(sum);
        }*/
        
      //Given a List of integers, write a program to find the maximum element using streams.
        int max = nums.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        
        /* my try
        Optional<Integer> max = nums.stream().max((a,b)->a.compareTo(b));
        System.out.println(max);
        */
        
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

        //Given a List of strings, write a program to count the number of strings that start with a specific character using streams.
        long count = fruits.stream().filter(str -> str.startsWith("b")).count();
        System.out.println(count);
        
       //Write a program to convert a List of strings to uppercase using streams.
        List<String> upperCaseFruits = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseFruits);
        //OR
        //fruits.stream().map(String::toUpperCase).forEach(System.out::println);
        
        
        //Given a List of integers, write a program to filter out the even numbers using streams.
        // Count the number of elements in a list that satisfy a specific condition using streams.
        
        nums.stream().filter(a -> (a%2==0)).forEach(System.out::println);
        
        
       //Write a program to find the average of a List of floating-point numbers using streams.
        List<Double> numsFloat = Arrays.asList(1.3, 2.4, 3.1, 4.2, 5.4);
        double avg = numsFloat.stream().mapToDouble(Double::doubleValue).average().getAsDouble(); //mapToDouble is used to convert the wrapper Double to primitive double value
        System.out.println(avg);
        
       //Given a List of strings, write a program to concatenate all the strings using streams.
        //List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");
        String concat = fruits.stream().collect(Collectors.joining(" "));
        System.out.println(concat);
        /* My Try
        String conString = fruits.stream().reduce((a,b)-> a+b).get();
        System.out.println(conString);
        */
        
       //Write a program to remove duplicate elements from a List using streams.
        List<Integer> uniqInts = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqInts);
        //nums.stream().distinct().forEach(System.out::println);;
       
        
   
        
      //Given a List of objects, write a program to sort the objects based on a specific attribute using streams.
        List<Person> people = Arrays.asList(
                new Person("Alice", 21),
                new Person("Anna", 29),
                new Person("Bob", 30),
                new Person("Barbie", 56),
                new Person("Charlie", 20)
        );
        
        //Sort using age
        people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList()).forEach(System.out::println);
        
        //Write a program to check if all elements in a List satisfy a given condition using streams.
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = numbers.stream().allMatch(n -> n%2 == 0);
        System.out.println(allEven);
        
        //Check if a list contains a specific element using streams.
        boolean exists = nums.stream().anyMatch(n->n.equals(9));
        System.out.println(exists);
        
        //Sort a list of strings in ascending order using streams.
        List<String> ascSorted = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(ascSorted);
        
        //Sort a list of strings in desc order using streams.
        List<String> descSorted = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descSorted);
        
        
        //Create a new list containing the square of each element from the original list using streams
        List<Integer> squares = nums.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println("Square of nums elements: "+squares);
        
        
        //Find the average length of strings in a list using streams.
        List<Integer> lengths = fruits.stream().map(fruit -> fruit.length()).collect(Collectors.toList());
        System.out.println("length of each element in fruits: "+lengths);
        
        //Find the average length of strings in a list using streams.
        double avgLength = fruits.stream().mapToInt(String::length).average().orElse(0.0);
        System.out.println("The average length of elements in fruits list: "+avgLength);
        
        //Find the longest string in a list using streams.
        int maxLength = fruits.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("The max length of elements in fruits list: "+maxLength);
        
        //Remove null values from a list using streams.
        List<String> nonNullValues = fruits.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());


        //Find the second smallest element in a list of integers using streams.
        Optional<Integer> secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
        
        Optional<Integer> secondLargest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("second Largest is: "+secondLargest);
	}

}
