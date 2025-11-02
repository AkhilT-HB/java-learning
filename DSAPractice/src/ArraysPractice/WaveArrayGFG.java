package arraysPractice;

import java.util.Arrays;

public class WaveArrayGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		sortInWave(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void sortInWave(int arr[]) {
        // code here
         for(int i=0;i<arr.length-1;i+=2){
             int temp = arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=temp;
         }
    }
}
