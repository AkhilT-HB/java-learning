package GFGProblems_TwoPointers;

/*
 * Given two unsorted arrays a[] and b[] each consisting of distinct elements , the task is to return the count of elements in the intersection (or common elements) of the two arrays.

Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 
Examples:

Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
Output: 1
Explanation: 89 is the only element in the intersection of two arrays.
Input: a[] = [1, 2, 3, 4, 5, 6], b[] = [3, 4, 5, 6, 7]
Output: 4
Explanation: 3 4 5 and 6 are the elements in the intersection of two arrays.
 * 
 * 
 * 
 */

import java.util.HashSet;

public class IntersectionOfTwoArraysWithDistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = {3, 4, 5, 6, 7};
		
		int hsSize = numberofElementsInIntersection(a, b);
		
		int aSize=a.length;
		int bSize=b.length;
		int totalSize = aSize+bSize;
		
		int result = totalSize - hsSize;
		
		System.out.println(result);
	}
	
	public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			hs.add(b[i]);
		}
		
		return hs.size();
		
    }

}
