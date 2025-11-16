package arraysPractice;

public class SumOfSubArraysGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		
		System.out.print(subarraySum(arr));	
	}

	public static int subarraySum(int[] arr) {
		// code here
		int n = arr.length;
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += arr[i] * (i + 1) * (n - i);
		}
		return result;
	}

}
