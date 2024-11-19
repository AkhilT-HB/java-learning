package GFGProblems_TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeRemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
		
		removeDuplicates(nums);
	}

	public static int removeDuplicates(int[] nums) {

		List<Integer> temp = new ArrayList<>();
		int size = 0;

		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] != nums[i + 1]) {
				temp.add(nums[i]);
				size++;
			}
		}
		
		temp.add(nums[nums.length-1]);
		
		System.out.println(temp);
		
		
		return temp.size();
	}

}
