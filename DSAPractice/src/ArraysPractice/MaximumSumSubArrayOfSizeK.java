package arraysPractice;

public class MaximumSumSubArrayOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 5, 1, 3, 2};
		int k = 3;
		
		System.out.println(maxSubArraySum(arr,k));
	}
	
	public static int maxSubArraySum(int[] arr,int k) {
		int maxSum = 0;
		int windowSum = 0;
		int start = 0;
		
		for(int end=0;end<arr.length;end++) {
			windowSum += arr[end];
			
			if(end >= k - 1) {
				maxSum = Math.max(maxSum,windowSum);
				windowSum -= arr[start];
				start++;
			}
		}
		
		return maxSum;
	}
	
	

}
