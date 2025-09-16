package BinarySearch;

public class BSOrderNotKnownSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 20, 17, 15, 14, 13, 12, 10, 9, 8, 4 };
		//int[] arr = {1,2,3,4,5,6,7,8,9};

		int start = 0;
		int end = arr.length - 1;
		
		int target = 4;
		
		if(arr.length==1) {
			if(arr[0]==target) System.out.println(0);
		}else if( arr[0]<arr[1]) {
			while(start<=end) {
				int mid = start  + (end - start / 2);
				if(arr[mid] == target) {
					System.out.println(mid);
					break;
				}else if(target < arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}
		}else if( arr[0]>arr[1]) {
			while(start<=end) {
				int mid = start  + (end - start / 2);
				if(arr[mid] == target) {
					System.out.println(mid);
					break;
				}else if(target < arr[mid]) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
			}
		}

	}

}
