package arraysPractice;

import java.util.Arrays;

public class RearrangeArrayAlternativelyGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {890,289,483,519,550,447,946,957,92,783};
		//int[] arr = {1, 2, 3, 4, 5, 6};---- Another TestCase
		//int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110}; ---- Another TestCase
		System.out.println(Arrays.toString(arr));
	}
	public static void rearrange(int arr[]) {
        Arrays.sort(arr);
        int maxInd = arr.length - 1;
        int minInd = 0;
        
        int m = arr[arr.length-1] + 1;
        
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] += (arr[maxInd]%m)*m;
                maxInd--;
            }else{
                arr[i] += (arr[minInd]%m)*m;
                minInd++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]/m;
        }
        
    }

}
