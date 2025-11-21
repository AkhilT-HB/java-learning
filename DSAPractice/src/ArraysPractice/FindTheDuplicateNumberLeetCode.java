package arraysPractice;

import java.util.HashMap;
import java.util.Map;

public class FindTheDuplicateNumberLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1,3,4,2};
		
		System.out.println(findDuplicateUsingBS(nums));
	}
	
	public static int findDuplicateUsingMap(int[] nums) {
	       Map<Integer,Integer> map = new HashMap<>();

	       for(int num : nums){
	        map.put(num, map.getOrDefault(num,0)+1);

	        if(map.get(num) >= 2) return num;
	       }

	       return -1;
	    }
	
	public static int findDuplicateUsingBS(int[] nums) {
        int n = nums.length - 1;
       int start = 1;
       int end = n;

       while(start<end){
        int mid = start + ((end-start)/2);

        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid) count++;
        }

        if(count<=mid){
            start = mid + 1;;
        }else{
            end = mid;
        }
       }

       return end;
    }

}
