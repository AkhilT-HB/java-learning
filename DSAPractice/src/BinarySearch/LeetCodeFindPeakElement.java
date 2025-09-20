package binarySearch;

public class LeetCodeFindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
		System.out.println(findPeakElement(nums));	
	}

	public static int findPeakElement(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		if (nums.length == 1) {
			return 0;
		}

		while (start < end) {
			int mid = start + ((end - start) / 2);

			if (nums[mid + 1] > nums[mid]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}

}
