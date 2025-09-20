package binarySearch;

public class LeetCodeFindMinimumInRotatedSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4,5,6,7,0,1,4 };

		System.out.println(findMin(nums));

	}
	public static int findMin(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        int min = Integer.MAX_VALUE;

        if (nums.length == 1) return nums[0];

        while(start<=end){
            int mid = start + ((end - start)/2);

            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                min = Math.min(min, nums[mid]);
                start++;
                end--;
                continue;
            }

            // if(nums[start]<=nums[end]){
            //     if(nums[start]<min){
            //         min = nums[start];
            //         break;
            //     }
            // }

            if(nums[start]<=nums[mid]){
                if(nums[start]<min){
                    min = nums[start];
                }
                start = mid + 1;
            }else if(nums[mid]<=nums[end]){
                if(nums[mid]<min){
                    min = nums[mid];
                }
                end = mid - 1;
            }
        }

        return min;
        
    }

}
