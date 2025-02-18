 	package Arrays;

import java.util.Arrays;

public class TwoDimensionalArray {
	int arr[][] = null;

	// Constructor
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	//Inserting Values in 2D array
	public void insertValueInTheArray(int row, int column, int value) {
		try {
			if(arr[row][column]==Integer.MIN_VALUE) {
				arr[row][column]=value;
				System.out.println("The value is successfully inserted");
			}else {
				System.out.println("The cell is already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The index is not valid for 2D array");
		}
	}

}
