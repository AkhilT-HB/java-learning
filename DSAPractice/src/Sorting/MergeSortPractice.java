package sorting;

public class MergeSortPractice {



	// Utility function to print the array
	public static void printArray(int[] arr) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}

	// Main function
	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

		System.out.println("Original Array:");
		printArray(arr);

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("\nSorted Array:");
		printArray(arr);
	}

	private static void mergeSort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int mid = start + ((end-start)/2);
			
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			
			merge(arr,start,mid,end);  
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		int[] l = new int[n1];
		int[] r = new int[n2];
		
		for(int i=0;i<n1;i++) {
			l[i]=arr[start+i];
		}
		for(int j=0;j<n2;j++) {
			r[j]=arr[mid+1+j];
		}
		
		int i=0;
		int j=0;
		int k=start;
		
		while(i<n1&&j<n2) {
			if(l[i]<=r[j]) {
				arr[k]=l[i];
				i++;
			}else {
				arr[k]=r[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=l[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=r[j];
			j++;
			k++;
		}
		
	}
}
