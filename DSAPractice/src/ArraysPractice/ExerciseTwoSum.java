package ArraysPractice;

import java.util.Arrays;

public class ExerciseTwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,7,11,15};
		int target = 9;
		
		int[] output = twoSum(nums, target);
		
		System.out.println(Arrays.toString(output));

	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		int i = 0;
		int[] result = new int[2];
		
		for(int j=i+1;j<nums.length;j++) {
			
			if(nums[i]+nums[j] == target) {
				result[0]=i;
				result[1]=j;
				
				return result;
			}
			
			i++;
		}
		
		return result;
	    
	}

}
