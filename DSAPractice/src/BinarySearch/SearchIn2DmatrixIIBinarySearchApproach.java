package binarySearch;

public class SearchIn2DmatrixIIBinarySearchApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        boolean result = searchMatrix(matrix,target);
        System.out.println(result);
	}

	private static boolean searchMatrix(int[][] matrix, int target) {
		 int m = matrix.length;
	        int n = matrix[0].length;

	        for(int i=0;i<m;i++){
	            if(matrix[i][0]<=target && matrix[i][n-1]>=target){
	    	        int start = 0;
	    	        int end = n-1;
	            	while(start<=end) {
		                int mid = start + ((end-start)/2);

		                if(matrix[i][mid]==target){
		                    return true;
		                }else if(target<matrix[i][mid]){
		                    end = mid - 1;
		                }else{
		                    start = mid + 1;
		                }
	            	}
	            }
	        }
	        return false;
	}
	
	

}
