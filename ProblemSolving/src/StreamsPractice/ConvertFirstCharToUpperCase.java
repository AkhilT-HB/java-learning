package StreamsPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertFirstCharToUpperCase {

	public static void main(String[] args) {
		
		String input = "welcome to java stream apis";
		
		String[] words = input.split(" ");
		
		//out out should be "Welcome To Java Stream Apis"
		
		
		//String out =  Arrays.stream(words).map(word->word.substring(0, 1).toUpperCase()+word.substring(1)).reduce((a,b)->a+" "+b).orElse(null);
		
		String out =  Arrays.stream(words).map(word->word.substring(0, 1).toUpperCase()+word.substring(1)).collect(Collectors.joining(" "));
		
		System.out.println(out);
	}

}
