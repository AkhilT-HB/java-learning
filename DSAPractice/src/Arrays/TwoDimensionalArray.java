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
		//System.out.println(Arrays.deepToString(arr));
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
	
	//Accessing cell value of the array
	public void accessCell(int row, int column) {
		System.out.println("\nAccessing row#"+row+", col#"+column);
		try {
			System.out.println("Cell value is "+arr[row][column]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The index is not valid for 2D array");
		}
	}
	
	//Traversing 2D array
	public void traverse2DArray() {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	//Searching a single value from array
	public void searchValue(int value) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==value) {
					System.out.println("The value is in arr["+row+"]["+col+"]");
					return;
				}
			}
		}
		
		System.out.println("Value is not found");
	}
	
	//Deleting a value from 2D array
	public void deleteValueFromArray(int row, int col) {
		try {
			System.out.println("Successfully deleted: "+ arr[row][col]);
			arr[row][col]=Integer.MIN_VALUE;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This index is not valid for array");
		}
	}

}
