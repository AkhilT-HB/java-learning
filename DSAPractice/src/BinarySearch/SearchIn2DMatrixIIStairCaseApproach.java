package binarySearch;

public class SearchIn2DMatrixIIStairCaseApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        boolean result = searchMatrix(matrix,target);
        System.out.println(result);
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;

        while(i<matrix.length && j>=0){
            int value = matrix[i][j];

            if(value==target){
                return true;
            }else if(target>value){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
	

}
