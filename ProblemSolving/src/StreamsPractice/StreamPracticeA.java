package StreamsPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/* 1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions in sorted manner? */
/* 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions? */
/* 3. How to find duplicate elements in a given integers list in java using Stream functions? */
/* 4. Given the list of integers, find the first element of the list using Stream functions?*/
/* 5. Given a list of integers, find the total number of elements present in the list using Stream functions?*/
/* 6. Given a list of integers, find the maximum value element present in it using Stream functions?*/
/* 7. Given a String, find the first non-repeated character in it using Stream functions?*/

public class StreamPracticeA {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		
		
		// 1.
		// list.stream().filter(e -> e%2 == 0).sorted().forEach(System.out::println);
		
		// 2.
		// list.stream().map( m -> m+" ").filter( e -> e.startsWith("1")).forEach(System.out::println);
		
		// 3.
//		Set<Integer> set = new HashSet();
//		list.stream().sorted().filter( n -> !set.add(n)).forEach(System.out::println);
		
		// 4.
		//list.stream().findFirst().ifPresent(System.out::println);
		
		// 5.
		//long count = list.stream().count();
		//System.out.println(count);
		
		// 6.
		//My Answer:
		//list.stream().max((a,b)-> Integer.compare(a, b)).ifPresent(System.out::println);
		// OR (Other answer)
		//int max = list.stream().max(Integer::compare).get();
		//System.out.println(max);
		
//		String input = "Java articles are Awesome";
//		char[] strArr = input.toCharArray();
//		
//		List<Object> ch = Arrays.asList(strArr);
//		
//		Optional<Object> value = ch.stream().distinct().findFirst();
		
		
		
		String str = "welcome";
		
		char[] chArr = str.toCharArray();
		
		Set uniqueVal = new HashSet();
		
		Arrays.asList(chArr).stream().map(c -> uniqueVal.add(c)).collect(Collectors.toSet());
		
		System.out.println(uniqueVal);
	}

}
