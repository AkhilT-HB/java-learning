package binarySearch;

public class BSOnReverseSortedArray {

	public static void main(String[] args) {
		int[] arr = {20,17,15,14,13,12,10,9,8,4};
		
		int start = 0;
		int end = arr.length - 1;
		
		int target = 4;
		
		while(start<=end) {
			int mid = start + (end-start / 2);
			if(arr[mid] == target) {
				System.out.println(mid);
				break;
			}else if (target > arr[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
			
		}

	}

}
