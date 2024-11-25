package leetCodeProblems;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {0};
		
		int m = 0;
		
		int[] nums2 = {1};
		
		int n = 1;
		
		merge(nums1,m,nums2,n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		//my try
		int j=0;
		for(int i=m;i<nums1.length;i++) {
			nums1[i]=nums2[j];
			j++;
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

//	public static void merge(int[] nums1, int m, int[] nums2, int n) {
//		
//		if(n == 0) {
//			System.out.println(Arrays.toString(nums1));
//			return;
//		}
//		
//		
//		
//		int j = n-1;
//		
//		for(int i=nums1.length-1;i>=0;i--) {
//			if(nums1[i]==0) {
//				nums1[i]=nums2[j];
//				j--;
//			}else {
//				break;
//			}
//		}
//		
//		Arrays.sort(nums1);
//		
//		System.out.println(Arrays.toString(nums1));
//
//	}

}
