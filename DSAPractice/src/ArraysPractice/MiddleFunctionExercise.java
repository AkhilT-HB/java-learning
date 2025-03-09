package ArraysPractice;

import java.util.Arrays;

public class MiddleFunctionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,6};
		int[] newArray = middle(arr);
		
		System.out.println(Arrays.toString(newArray));

	}
	
	public static int[] middle(int[] array) {
        // TODO
        int[] newArray = new int[array.length-2];
        int newArrIndex=0;
        for(int i=1;i<array.length-1;i++){
            newArray[newArrIndex]=array[i];
            newArrIndex++;
        }
        //System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(newArray));
        
        return newArray;
    }

}
