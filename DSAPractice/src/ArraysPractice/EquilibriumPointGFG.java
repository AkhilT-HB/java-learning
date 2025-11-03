package arraysPractice;

public class EquilibriumPointGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 0, 3};
		System.out.println(findEquilibrium(arr));
	}
	public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        if(n==1) return 0;
        
        int totalSum = 0;
        for(int i=0;i<n;i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for(int i = 0;i<n;i++){
            int rightSum = totalSum - arr[i] - leftSum;
            
            if(rightSum == leftSum) return i;
            
            leftSum += arr[i];
        }
        
        return -1;
    }
}
