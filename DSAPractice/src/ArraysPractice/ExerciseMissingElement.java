package ArraysPractice;

/*
 * Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Example

myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
Hint:

Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
 */

public class ExerciseMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1,2,3,4,6};
		
		int result = findMissingNumberInArray(myArray);
		
		System.out.println(result);
	}
	
	static int findMissingNumberInArray(int[] arr) {
	    // TODO
	    
	    if(arr.length>1){
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!=i+1){
	            return i+1;
	        }
	    }
	    }
	    
	    return 1;
	  }

}
