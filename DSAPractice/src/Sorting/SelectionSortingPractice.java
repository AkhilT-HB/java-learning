package sorting;

import java.util.Arrays;

public class SelectionSortingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,8,16,4,1,2};
		int n = arr.length;
		
		for(int i=0;i<(n-1);i++) {
			int minIndex = i;
			for(int j=i+1;j<=n-1;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
