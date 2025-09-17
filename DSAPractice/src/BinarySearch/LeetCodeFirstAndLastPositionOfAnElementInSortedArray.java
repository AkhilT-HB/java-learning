package BinarySearch;

import java.util.Arrays;

public class LeetCodeFirstAndLastPositionOfAnElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		
		int start = 0;
        int end = nums.length - 1;

        int first = -1;
        int last = -1;

        int[] result = new int[2];
        while(start<=end){
            int mid = start + ((end - start)/2);

            if(nums[mid] == target){
                 first = mid;
                 end = mid - 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
		start = 0;
        end = nums.length - 1;

        while(start<=end){
            int mid = start + ((end - start)/2);

            if(nums[mid] == target){
                last = mid;
                start = mid + 1;
            }else if (target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        result[0] = first;
        result[1] = last;
        System.out.println(Arrays.toString(result));

	}

}
