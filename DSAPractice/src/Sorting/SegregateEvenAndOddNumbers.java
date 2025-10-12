package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SegregateEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr);

        System.out.println(Arrays.toString(arr));
	}
	static void segregateEvenOdd(int arr[]) {
        // code here
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);  
            } 
            else {
                odd.add(arr[i]);
            }
        }
        
        Collections.sort(even);
        Collections.sort(odd);
        
        int count = 0;
        for(int num : even){
            arr[count]=num;
            count++;
        }
        for(int num:odd){
            arr[count]=num;
            count++;
        }
        
    }

}
