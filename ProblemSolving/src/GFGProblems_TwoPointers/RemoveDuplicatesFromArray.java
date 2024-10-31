package GFGProblems_TwoPointers;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 1, 2, 2, 2, 4, 2 };
		int n = a.length;
		
		int uniqueCount = removeduplicates(a,n);
		
		System.out.println(uniqueCount);
		

	}
	
	public static int removeduplicates(int a[], int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		int j=0;
		Arrays.sort(a);
		
		//creating another array for only storing unique elements
		int[] temp = new int[n];
		
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		//Adding last element to the array
		temp[j++]=a[n-1];
		
		//changing the original array
		for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

		System.out.println(Arrays.toString(temp));
		return j;
	}

}
