package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindLengthOfEachString {

	public static void main(String[] args) {
		String[] input = {"apple","banana","cherry","coconut"};
		
		//Arrays.stream(input).map(word->word.length()).forEach(e -> System.out.println(e));
		
		//Arrays.stream(input).forEach(e-> System.out.println("["+e+"]= "+e.length()));
		
		Arrays.stream(input).map(word -> word +"="+ word.length()).forEach(e->System.out.println(e));
		
		
		//To group the words based on length
		Map<Integer, List<String>> output = Arrays.stream(input).collect(Collectors.groupingBy(word -> word.length()));
		
		System.out.println(output);
	}

}
