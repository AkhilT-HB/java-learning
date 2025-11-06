package arraysPractice;
//LeetCode medium
public class MaxChunksToMakeSortedLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,3,6,0,7,8,2,5};
		System.out.println(maxChunksToSorted(arr));
	}
	 public static int maxChunksToSorted(int[] arr) {
	        int maxSoFar = 0;
	        int i = 0;
	        int chunks = 0;

	        while(i<arr.length){
	            maxSoFar = Math.max(maxSoFar, arr[i]);

	            if(maxSoFar == i){
	                chunks++;
	            }
	            i++;
	        }

	        return chunks;
	    }


}
