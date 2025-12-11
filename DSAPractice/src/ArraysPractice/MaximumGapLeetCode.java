package arraysPractice;

import java.util.Arrays;

public class MaximumGapLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,6,9,1};
		//int[] nums = {10};
		System.out.println(maximumGap(nums));
	}
	public static int maximumGap(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        if(n<2) return 0;
        int maxDistance = 0;
        for(int i=1;i<n;i++){
            int distance = nums[i]-nums[i-1];

            maxDistance = Math.max(distance, maxDistance);
        }

        return maxDistance;
    }

}
