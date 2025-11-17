package arraysPractice;

import java.util.Arrays;

public class ReArrangeArrayArrjBecomesArriBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 0, 1, 4, 5, 3};
        rearrange(arr);
        System.out.println(java.util.Arrays.toString(arr));
	}

	private static void rearrange(int[] arr) {
		// TODO Auto-generated method stub
		int[] newArr = Arrays.copyOf(arr, arr.length);
		
		for(int i=0;i<newArr.length;i++) {
			int value = newArr[i];
			arr[value]=i;
		}
	}

}
