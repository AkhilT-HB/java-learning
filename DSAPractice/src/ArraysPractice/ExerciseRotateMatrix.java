package arraysPractice;

import java.util.Arrays;

/*
Rotate Matrix
Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.

DO NOT allocate another 2D matrix and do the rotation.
 
*/

public class ExerciseRotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] matrix =  {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		
		System.out.println(Arrays.deepToString(matrix));
		
		rotateMatrix(matrix);
		
		System.out.println(Arrays.deepToString(matrix));

	}

	public static boolean rotateMatrix(int[][] matrix) {
		
		if(matrix.length==0 || (matrix.length != matrix[0].length)) return false;
		
		int n = matrix.length;
		
		for(int layer=0;layer<n/2;layer++) {
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;i++) {
				int offset = i-first;
				System.out.println("layer is: "+layer+" first is: "+first+" last is: "+last+" offset is: "+offset);

				int top = matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last-offset]=matrix[i][last];
				matrix[i][last]=top;
			}
		}

		
		return true;

	}

}
