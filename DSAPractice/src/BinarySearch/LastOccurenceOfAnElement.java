package binarySearch;

public class LastOccurenceOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,10,10,10,18,20};
		
		int start = 0;
		int end = arr.length-1;
		int target = 10;
		
		int result = -1;
		
		while(start<=end) {
			int mid = start + ((end - start)/2);
			
			if(arr[mid]==target) {
				result = mid;
				start = mid + 1;
			}else if(target<arr[mid]) {
				end = mid - 1;
			}else {
				start = start + 1;
			}
		}
		
		System.out.println(result);
	}

}
