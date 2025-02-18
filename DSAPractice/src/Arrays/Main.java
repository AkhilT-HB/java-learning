package Arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleDimensionArray sda = new SingleDimensionArray(10);
//		
//		sda.insert(0, 0);
//		sda.insert(1, 10);
//		sda.insert(2, 20);
//		sda.insert(1, 30);
//		sda.insert(12, 120);
		
		//System.out.println("Array traversal");
		//sda.traverseArray();
		
		//sda.searchInArray(40);
		
//		sda.deleteValue(0);
		//System.out.println(sda.arr[0]);
		
		TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
		tda.insertValueInTheArray(0, 0, 10);
		tda.insertValueInTheArray(0, 0, 20);
		System.out.println(Arrays.deepToString(tda.arr));
		
	}

}
