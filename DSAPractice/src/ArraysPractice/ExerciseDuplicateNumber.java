package ArraysPractice;

import java.util.Arrays;

public class ExerciseDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 1, 2, 2, 3, 4, 5};
		
		int[] newArr = removeDuplicatesDiffApproach(arr);
		
		System.out.println(Arrays.toString(newArr));

	}
	
	public static int[] removeDuplicates(int[] arr) {
		int count=0;
		for(int i=0;i<=arr.length-2;i++) {
			if(arr[i]!=arr[i+1]) {
				count++;
			}
		}
		
		System.out.println(count);
		int[] output = new int[count+1];
		int index = 0;
		
		for(int i=0;i<=arr.length-2;i++) {
			if(arr[i]!=arr[i+1]) {
				output[index]=arr[i];
				index++;
			}
		}
		
		output[output.length-1]=arr[arr.length-1];
		
		
		
		
		return output;
	}
	
	public static int[] removeDuplicatesDiffApproach(int[] arr) {
		
		int n = arr.length;
		int index = 0;
		
		int[] output = new int[n];
		
		for(int i=0;i<n;i++) {
			boolean isDuplicate = false;
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				output[index] = arr[i];
				index++;
			}
		}
		
		return Arrays.copyOf(output, index);
	}

}
