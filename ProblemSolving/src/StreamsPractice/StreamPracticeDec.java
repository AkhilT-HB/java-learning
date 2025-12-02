package StreamsPractice;

import java.util.List;
import java.util.stream.IntStream;

public class StreamPracticeDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = List.of(3,8,78,2,978,4,2,3,8,6,13,5,19);
		
		//ls.stream().filter(n -> (n%2==0)).forEach(System.out::println);
		//ls.stream().map(n->n*n).forEach(System.out::println);
		//ls.stream().distinct().map(n -> n*n).forEach(System.out::println);
		//System.out.println(ls.stream().max((a,b)-> Integer.compare(a, b)).get());
		
		//Get first 5 elements
		//ls.stream().limit(5).forEach(System.out::println);
		
		//Skip first 3 elements
		//ls.stream().skip(3).forEach(System.out::println);
		
		//Sort numbers in descending order
		//ls.stream().sorted((a,b)->b-a).forEach(System.out::println);
		//ls.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//Check if any number is greater than 100
		//System.out.println(ls.stream().anyMatch(n->n>100));
		
		//Check if all numbers are positive
		//boolean result = ls.stream().anyMatch(n->n>0);
		//System.out.println(result);
		
		//Sum of all numbers
		//System.out.println(ls.stream().mapToInt(n->(int)n).sum());
		//System.out.println(ls.stream().mapToInt(Integer::intValue).sum());
		
		//Average of all numbers
		//double avg = ls.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		List<String> lst = List.of("cat", "ball", "dog", "ice","love","apple","atom","apple");
		
		//List<String> ans = lst.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		//lst.stream().map(str -> str.length()).collect(Collectors.toList());
		//List<String> ans = lst.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		//long c = lst.stream().filter(str -> str.charAt(0)=='a'||str.charAt(0)=='A').count();
		//System.out.println(c);
		
		//Convert list to set
		//Set<String> set = lst.stream().collect(Collectors.toSet());
		//System.out.println(set);
		
		//lst.stream().sorted().forEach(System.out::println);
		
		//Find first string with length > 5
		//System.out.println(lst.stream().filter(str -> str.length()>=5).findFirst().orElse(null));
		
		//Reverse sort strings based on length
		//lst.stream().sorted((a,b)-> b.length() - a.length()).forEach(System.out::println);
		
		//Get distinct characters from a string
		/*String str = "banana";
		List<Character> ch = str.chars().distinct().mapToObj(c -> (char)c).collect(Collectors.toList());
		System.out.println(ch);*/
		
		
		
		
		
		
		
		
		
		
		///// SET 3 practice
		//Find pro
		//int[] input = {2,3,4};
		//System.out.println(Arrays.stream(input).reduce(1, (a,b)-> a*b));
		
		//Find the longest String
		//String[] input = {"cat", "elephant", "dog"};
		//System.out.println(Arrays.stream(input).sorted((a,b)->b.length()-a.length()).findFirst().orElse(null));
		//String longest = Arrays.stream(input).max(Comparator.comparing(String::length)).orElse(null);
		//System.out.println(longest);
		
		
		//Count the frequency of a character in a string
		//String input = "banana";
		//long count = input.chars().filter(ch -> ch == 'a').count();
		//System.out.println(count);
		
		
		//Find Sum of squares
		//int[] input = {1,2,3};
		//System.out.println(Arrays.stream(input).map(n->n*n).reduce((a,b)->a+b).orElse(0));
		
		//Convert List<String> to IntStream of lengths
		List<String> input = List.of("hi","hello");
		IntStream lengths = input.stream().mapToInt(String::length);
		lengths.forEach(System.out::println);
	}
 
}
