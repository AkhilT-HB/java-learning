package RandomProblems;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {3,2,5,8};
		int arr2[] = {2,3,5,7};
		
		boolean result = compareArrays(arr1,arr2);
		
		System.out.println(result);
	}
	
	public static boolean compareArrays(int arr1[],int arr2[]) {
		
		if(arr1.length != arr2.length) {
			return false;
		}else {
			int n = arr1.length;
			
//			for(int i=0;i<n-2;i++) {
//				int temp=0;
//				if(arr1[i]>arr1[i+1]) {
//					temp=arr1[i];
//					arr1[i]=arr1[i+1];
//					arr1[i+1]=temp;
//				}
//			}
//			
//			for(int i=0;i<n-2;i++) {
//				int temp=0;
//				if(arr2[i]>arr2[i+1]) {
//					temp=arr2[i];
//					arr2[i]=arr2[i+1];
//					arr2[i+1]=temp;
//				}
//			}
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
		}
		
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		
		if(Arrays.equals(arr1, arr2)) { 
			return true;
		}else {
			return false;
		}
		
	
		
		
		
		
	}

}
