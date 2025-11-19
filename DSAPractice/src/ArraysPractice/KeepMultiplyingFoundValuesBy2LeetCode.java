package arraysPractice;

import java.util.Arrays;

public class KeepMultiplyingFoundValuesBy2LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,3,6,1,12};
		int original = 2;
		System.out.println(findFinalValue(nums,original));
	}
	
	public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int num : nums){
            if(num == original){
                original = 2 * original;
            }
        }

        return original;
    }

}
