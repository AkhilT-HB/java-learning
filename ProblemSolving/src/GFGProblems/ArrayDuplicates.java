package GFGProblems;
/*Given an array arr of size n which contains elements in range from 0 to n-1, 
 * you need to find all the elements occurring more than once in the given array. Return the answer in ascending order.
 * If no such element is found, return list containing [-1].
 * 
 * Examples:
 * Input: n = 4, arr[] = [0,3,1,2]
	Output: -1
	Explanation: There is no repeating element in the array. Therefore output is -1.
	
	Input: n = 5, arr[] = [2,3,1,2,3]
	Output: 2 3 
	Explanation: 2 and 3 occur more than once in the given array.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		//My Code
		

	}
	
	public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        
        
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    set.add(arr[i]);
                }
            }
        }
        
        ArrayList<Integer> output = new ArrayList<>(set);
       
        if(output.isEmpty()){
            output.add(-1);
        }
        
        Collections.sort(output);
        return output;
    }

}
