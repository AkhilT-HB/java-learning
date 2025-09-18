package binarySearch;

public class CountOfAnElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,4,10,10,10,18,20};
		
		int start = 0;
		int end = nums.length-1;
		
		int target = 10;
		int first = -1;
		int last = -1; 
		
		while(start<=end) {
			int mid = start + ((end-start)/2);
			
			if(nums[mid]==target) {
				first = mid;
				end = mid - 1;
			}else if(target < nums[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
		start = 0;
		end = nums.length - 1;
		
		while(start<=end) {
			int mid = start + ((end-start)/2);
			
			if(nums[mid]==target) {
				last = mid;
				start =  mid + 1;
			}else if(target < nums[mid]) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		
		int count = last - first + 1;
		
		System.out.println(count);

	}

}
