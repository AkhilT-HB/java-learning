package binarySearch;

public class FirstOccurrenceOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,10,10,10,18,20};
		
		int start = 0;
		int end = arr.length-1;
		int target = 10;
		
		int result = -1;
		
		while(start<=end) {
			int mid = start + ((end - start)/2);
			
			if(arr[mid] == target) {
				result = mid;
				end = mid - 1;
			}else if(target<mid) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
		System.out.println(result);
	}

}
