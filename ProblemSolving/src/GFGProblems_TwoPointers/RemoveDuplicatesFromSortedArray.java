package GFGProblems_TwoPointers;

import java.util.Iterator;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr =  List.of(2,2,2,2,2);
		
		remove_duplicate(arr);
	}
	
	public static int remove_duplicate(List<Integer> arr) {
        // Code Here
        
        int i=0;
        int n=arr.size();
        
        for(int j=1;j<n;j++) {
        	if(!arr.get(j).equals(arr.get(i))) {
        		i++;
        		arr.set(i, arr.get(j));
        	}
        }
        
        
        return i+1;
    }

}
