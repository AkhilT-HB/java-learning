package binarySearch;
//REFER : https://www.geeksforgeeks.org/dsa/maximum-subarray-size-subarrays-size-sum-less-k/
public class BruteForceMaximumSubArraySizeHavingAllSubArraysSumLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
        int k = 8;
        System.out.println(maxSubarraySize(arr, k));
	}

	private static int maxSubarraySize(int[] arr, int k) {
		int n  = arr.length;
		int ans = -1;
		for(int i = 1;i <= n;i++) {
			int maxSum = Integer.MIN_VALUE;
			for(int j = 0;j < n-i+1;j++) {
				int sum = 0;
				for(int l = j;l < j + i;l++) {
					sum += arr[l];
				}
				maxSum = Math.max(maxSum, sum);
			}
			if(maxSum<=k) {
				ans =  Math.max(ans, i);
			}
		}
		return ans;
	}

}
