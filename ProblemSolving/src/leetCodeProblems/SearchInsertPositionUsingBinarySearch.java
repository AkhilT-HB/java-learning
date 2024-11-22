package leetCodeProblems;

public class SearchInsertPositionUsingBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 5, 6 };
		int target = 5;
		
		int output = searchInsert(nums, target);
		System.out.println(output);
	}

	public static int searchInsert(int[] nums, int target) {

		int s = 0;
		int e = nums.length - 1;

		if (target < nums[s]) {
			return 0;
		}
		if (target > nums[e]) {
			return nums.length;
		}

		while (s <= e) {
			int mid = (s + (e - s)) / 2;

			if (target < nums[mid]) {
				e = mid - 1;
			} else if (target > nums[mid]) {
				s = mid + 1;
			} else {
				return mid;
			}
		}
		return s;
	}
}
