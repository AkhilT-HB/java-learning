package binarySearch;

import java.util.Arrays;

public class KthSmallestElementInAnUnsortedArray {
	
	public static void main(String[] args) {
		int[] arr = {12, 3, 5, 7, 19};
		int k = 2;
		
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		int low  = min;
		int high = max;
		
		while(low<=high) {
			int mid = low + ((high - low)/2);
			int countless = 0;
			int countequal = 0;
			for(int i = 0;i<arr.length;i++) {
				if(arr[i]<mid) ++countless;
				
				if(arr[i]==mid) ++countequal;
			}
			if(countless < k && (countless + countequal) >= k) {
				System.out.print(mid);
				break;
			}else if(countless >= k) {
				high = mid - 1;
			}else if(countless < k){
				low = mid + 1;
			}
		}
		
	}
}
