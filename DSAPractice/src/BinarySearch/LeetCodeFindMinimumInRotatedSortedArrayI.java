package binarySearch;

public class LeetCodeFindMinimumInRotatedSortedArrayI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4,5,6,7,0,1,2 };

		System.out.println(findMin(nums));
	}

	public static int findMin(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		int min = Integer.MAX_VALUE;

		while (start <= end) {
			int mid = start + ((end - start) / 2);
			if (nums[start] <= nums[end]) {
				if (nums[start] < min) {
					min = nums[start];
					break;
				}
			}

			if (nums[start] <= nums[mid]) {
				if (nums[start] < min) {
					min = nums[start];
				}
				start = mid + 1;
			} else if (nums[mid] <= nums[end]) {
				if (nums[mid] < min) {
					min = nums[mid];
				}
				end = mid - 1;
			}
		}

		return min;
	}
}
