package arraysPractice;

public class MaxCircularSubArraySumGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, -8, 9, -9, 10, -11, 12};
		//Another test case to consider
		//int[] arr = {-4, -2, -1, -2, -6};
        System.out.println(maxCircularSum(arr));
	}
	
	public static int maxCircularSum(int arr[]) {
        // code here
            int currMax = 0, currMin = 0;
            int maxSum = arr[0], minSum = arr[0];
        
        int totalSum = 0;
        
        for(int i=0;i<arr.length;i++){
            
            currMax = Math.max(currMax+arr[i],arr[i]);
            maxSum = Math.max(maxSum,currMax);
            
            currMin = Math.min(currMin+arr[i],arr[i]);
            minSum = Math.min(minSum,currMin);
            
            totalSum += arr[i];
        }
        
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        
        if(minSum == totalSum) return normalSum;
        
        return Math.max(normalSum,circularSum);
        
    }

}
