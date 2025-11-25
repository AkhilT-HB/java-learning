package arraysPractice;

public class MaximumSubArrayKadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
	}

	private static int maxSubarraySum(int[] arr) {
		// TODO Auto-generated method stub
		int maxEnding = arr[0];
		int result = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			maxEnding = Math.max(maxEnding + arr[i], arr[i]);
			
			result = Math.max(maxEnding, result);
		}
		
		return result;
	}
	
}
