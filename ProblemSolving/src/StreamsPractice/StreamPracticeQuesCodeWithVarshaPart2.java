package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPracticeQuesCodeWithVarshaPart2 {

	public static void main(String[] args) {
		
        //1. Given a sentence, find and print the frequency of each word.
        String sentence = "Java is a programming language. Java is versatile.";
        
        Map<String, Long> wordFrequency = Arrays.stream(sentence.split("\\s+")).collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
        System.out.println(wordFrequency);
        
        //2. Given a list of integers, find out all the numbers starting with 1.
        List<Integer> nums = Arrays.asList(12, 13, 18, 21, 90, 11);
        nums.stream().map(e -> e+" ").filter(e -> e.startsWith("1")).forEach(System.out::println);
        //Another approach
        //List<Integer> numsWithOne = nums.stream().filter( n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());
        
        
        //3. Given a list of names, group them by their first letter, and then count the number of names in each group. 
        String[] names = {"Alice", "Bob", "Charlie", "Amy", "Bill", "Anna"};
        
        //Map<String, Long> output = Arrays.stream(names).collect(Collectors.groupingBy(String::substring(0,1), Collectors.counting()));
	}

}
