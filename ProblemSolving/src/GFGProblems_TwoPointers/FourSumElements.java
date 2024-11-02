package GFGProblems_TwoPointers;

public class FourSumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 5, 1, 0, 6, 0};
		int n=6;
		int x=7;
		
		System.out.println(find4Numbers(A, n, x));
	}
	
	static boolean find4Numbers(int A[], int n, int X) 
    {	
		int k=0;
		int l=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				k=j+1;
				l=n-1;
				while(k<l) {
					if(A[i]+A[j]+A[k]+A[l]==X) {
						System.out.println(A[i]+" "+A[j]+" "+A[k]+" "+A[l]);
						return true;
					}
					else if(A[i]+A[j]+A[k]+A[l]<X) k++;
					else l--;
				}
				
			}
			
		}
		
		
         
         return false;
    }

}
