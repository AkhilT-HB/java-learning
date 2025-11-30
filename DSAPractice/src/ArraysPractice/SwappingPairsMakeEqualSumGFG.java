package arraysPractice;

import java.util.HashSet;

public class SwappingPairsMakeEqualSumGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 1, 2, 1, 1, 2};
		int[] b = {3, 6, 3, 3};
		
		System.out.println(findSwapValues(a, b));
	}
	static boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        
        int sum1 = sum(a);
        int sum2 = sum(b);
        
        int diff = sum1-sum2;
        
        if((Math.abs(diff)%2) != 0) return false;
        
        int target = diff/2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        
        for(int i=0;i<a.length;i++){
            int y = a[i]-target;
            
            if(set.contains(y)){
              return true;  
            } 
        }
        
        return false;
    }
    
    public static int sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

}
