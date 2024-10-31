package RandomProblems;

public class SecondHighestNumberWithoutSortingUsingForLoop {

	public static void main(String[] args) {
		int[] numbers = {3,9,1,7,2,9,6};
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int num : numbers) {
			if(num > highest) {
				
				secondHighest = highest;
				highest = num;
			}else if( num > secondHighest && num != highest) {
				secondHighest = num;
			}
		}
		
		System.out.println(secondHighest);
	}

}
