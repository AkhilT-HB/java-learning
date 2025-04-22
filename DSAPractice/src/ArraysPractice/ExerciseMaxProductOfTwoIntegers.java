package ArraysPractice;

import java.util.Arrays;

public class ExerciseMaxProductOfTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {10,20,30,40,50};
		
		System.out.println(maxProduct(intArray));

	}
	
	public static String maxProduct(int[] intArray) {
        // TODO
		System.out.println(Arrays.toString(intArray));
		int maxProduct = Integer.MIN_VALUE;
		int first = 0;
		int second = 0;
		
		
		for(int i=0;i<intArray.length-1;i++) {
			for(int j=i+1;j<intArray.length;j++) {
				
				if((intArray[i]*intArray[j])>maxProduct) {
					first=intArray[i];
					second=intArray[j];
					
					maxProduct = first*second;
				}
				
				//System.out.println("maxProduct is "+maxProduct);
			}
		}
		
		String output = " "+first+" "+second;
		
		return output;
    }


}
