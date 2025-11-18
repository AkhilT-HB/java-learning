package arraysPractice;

import java.util.Arrays;

public class ReArrangeArrayArrjBecomesArriModuloMethodGFG {
	public static void main(String[] args) {

        int[] arr = {2, 0, 1, 4, 5, 3};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }
	
	public static void rearrange(int[] arr) {

        int n = arr.length;

        // Store new values using modulo
        for (int i = 0; i < n; i++) {
        	int target = arr[i] % n;
            arr[target] += i * n;
        }

        // Extract new values
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }

}
