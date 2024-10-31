package GFGProblems_TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSumPairsWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1, 0, 1, 2, -1, -4};
		
		ArrayList<ArrayList<Integer>>  output = getPairs(arr);
		System.out.println(output);

	}
	
	public static ArrayList<ArrayList<Integer>>  getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        Arrays.sort(arr);
        
        int left = 0;
        int right = (arr.length)-1;
        int target = 0;
        
        while(left<right) {
         int sum = arr[left] + arr[right];
        	 if(sum == target){
                 
                 ArrayList<Integer> temp = new ArrayList<>();
                 temp.add(arr[left]);
                 temp.add(arr[right]);
                 
                 result.add(temp);
                 
                 left++;
                 right--;
                 
                 while(arr[left]==arr[left-1]) {
                	 left++;
                 }
                 while(arr[right]==arr[right-1]) {
                	 right--;
                 }
                 
             }else if(sum < target) {
            	 left++;
             }else {
            	 right--;
             }
        	
        }
		return result;
    }
}
