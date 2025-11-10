package arraysPractice;

public class MinimumSwapsAndKTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 5, 6, 3};
		int k = 3;
		System.out.println(minSwap(arr,k));
		
	}
	public static int minSwap(int[] arr, int k) {
        // Complete the function
        int goodCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k) goodCount++;
        }
        
        int start = 0;
        int end = goodCount - 1;
        
        int minCount = arr.length - goodCount;
        while(end<arr.length){
            int c = 0;
            for(int i = start;i<=end;i++){
                if(arr[i]>k) c++;
            }
            minCount = Math.min(minCount,c);
            start++;
            end++;
        }
        
        
        return minCount;
         
    }

}
