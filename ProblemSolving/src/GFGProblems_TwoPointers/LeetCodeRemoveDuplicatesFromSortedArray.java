package GFGProblems_TwoPointers;
/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
*/

import java.util.Arrays;

public class LeetCodeRemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		
		
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {

		int n=nums.length;
		int i=0;//to keep the position of the element that needs to be compared
		int j=1;//to loop and find the element which is not equal to i
		int k=1;//to keep the position that needs to be updated when an unequal element is found
		
		while(j<n) {
			if(nums[i]!=nums[j]) {
				nums[k]=nums[j];
				i++;
				k++;
			}else {
				j++;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
		return k;
	}

}
