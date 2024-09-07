package StreamsPractice;

import java.util.Arrays;

public class FindLengthOfEachString {

	public static void main(String[] args) {
		String[] input = {"apple","banana","cherry","coconut"};
		
		//Arrays.stream(input).map(word->word.length()).forEach(e -> System.out.println(e));
		
		Arrays.stream(input).forEach(e-> System.out.println("["+e+"]= "+e.length()));
	}

}
