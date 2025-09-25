package binarySearch;
//REFER: https://www.geeksforgeeks.org/dsa/maximum-subarray-size-subarrays-size-sum-less-k/
public class SlidingWindowMaximumSubArraySizeHavingAllSubArraysSumLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 10, 4};
        int k = 14;
        System.out.println(maxSubarraySize(arr, k));
	}

	private static int maxSubarraySize(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int minSize = n+1;
		int start = 0;
		int end = 0;
		long sum = 0;
		
		while(end<n) {
			sum += arr[end];
			end++;
			
			while(sum>k && start<end) {
				minSize = Math.min(end-start, minSize);
				sum = sum - arr[start];
				start++;
			}
		}
		
		if(minSize == n+1) {
			return n;
		}else if(minSize == 1) {
			return -1;
		}else {
			return minSize-1;
		}
	}

}
