package RandomProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondHighestNumberWithoutSortingUsingStream {

	public static void main(String[] args) {
		int[] numbers = {3,9,1,7,2,9,6};
		
		OptionalInt highest = Arrays.stream(numbers).max();
		
		OptionalInt secondHighest = Arrays.stream(numbers).filter( num -> num != highest.orElse(Integer.MIN_VALUE)).max();
		
		if(secondHighest.isPresent()) {
			System.out.println(secondHighest.getAsInt());
		}
	}

}
