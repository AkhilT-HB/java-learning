package ArraysPractice;

public class ExerciseFindingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5,6};
		
		System.out.println(searchInArray(intArray,6));
		
		System.out.println(binarySearch(intArray,6));

	}
	
	public static int searchInArray(int[] intArray, int valueToSearch) {
		
		for(int i=0;i<intArray.length;i++) {
			
			if(intArray[i]==valueToSearch) {
				return i;
			}
		}
		
		return -1;
		
    }
	
	public static int binarySearch(int[] intArray, int valueToSearch) {
		//Use binary search only if array is sorted
		int first = 0;
		int last = intArray.length-1;
		
		while(first<=last) {
			int mid = (first + last)/2;
			System.out.println("Mid is "+mid);
			
			if(valueToSearch == intArray[mid]) {
				return mid;
			}else if(valueToSearch < intArray[mid]) {
				last=mid-1;
			}else if(valueToSearch > intArray[mid]) {
				first=mid+1;
			}
		}
		
		return -1;
		
	}

}
