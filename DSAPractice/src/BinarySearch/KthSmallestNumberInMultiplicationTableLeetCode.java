package binarySearch;

public class KthSmallestNumberInMultiplicationTableLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 3;
		int k = 5;
		
		System.out.println(findKthNumber(m,n,k));
	}
	public static int findKthNumber(int m, int n, int k) {
        int low = 1;
        int high = m*n;

        while(low<high){
            int mid = (low + high)/2;

            int total = 0;
            for(int i=1;i<=m;i++){
                total += Math.min(mid/i,n);
            }

            if(total>=k){
                high = mid;
            }else{
                low = mid+1;
            }
        }

        return low;
        
    }
}
