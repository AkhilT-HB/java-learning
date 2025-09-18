package arraysPractice;

public class DiagonalElementsSumExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum = sumDiagonalElements(myArray2D);
		
		System.out.println(sum);
		
		

	}
	
	public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        
        for(int i=0;i<array[0].length;i++){
            for(int j=0;j<array.length;j++){
                if(i==j){
                    sum=sum+array[i][j];
                }
            }
        }
        
        return sum;
    }

}
