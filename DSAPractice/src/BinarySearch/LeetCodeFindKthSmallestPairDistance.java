package binarySearch;

import java.util.Arrays;

public class LeetCodeFindKthSmallestPairDistance {

	public static void main(String[] args) {
		int[] nums = {1,3,1};
		int k = 1;
		
		System.out.println(smallestDistancePair(nums,k));
	}
	public static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums[nums.length-1]-nums[0];


        while(low<high){
            int count = 0;
            int midDistance = low + ((high-low)/2);
            int j=0;
            for(int i = 0;i<nums.length;i++){
                while(j<nums.length && nums[j]-nums[i]<=midDistance){
                    j++;
                }
                count += (j-i-1);
            }
            
            if(count >= k){
                high = midDistance;
            } else{
                low = midDistance + 1;
            }
        }
        return low;

    }
}
