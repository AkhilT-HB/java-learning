package sorting;

import java.util.Arrays;

public class QuickSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,80,30,90,40,50,70};
		int n = arr.length;
		
		quickSort(arr,0,n-1);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start>=end) return;
		
		int p = partition(arr,start,end);
		
		quickSort(arr,start,p);
		quickSort(arr,p+1,end);
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = arr[start];
		int count = 0;
		
		for(int i=start+1;i<=end;i++) {
			if(arr[i]<=pivot) count++;
		}
		int pivotIndex = start + count;
		
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[start];
		arr[start]= temp;
		
		int i=start,j=end;
		while(i<pivotIndex && j>pivotIndex) {
			while(arr[i]<arr[pivotIndex]) i++;
			
			while(arr[j]>arr[pivotIndex]) j--;
			
			if(i<pivotIndex && j>pivotIndex) {
				int temporary = arr[i];
				arr[i] = arr[j];
				arr[j]= temporary;
				i++;j--;
			}
		}
		return pivotIndex;
	}

}
