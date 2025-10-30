package binarySearch;

public class AllocateMinimumPagesGFG {

	public static void main(String[] args) {
		int[] books = {12, 34, 67, 90};
        int students = 2;
        System.out.println(findPages(books, students));
	}
	public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if(k>n) return -1;
        
        int low = 0;
        int high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages); 
            high += pages;              
        }
        
        int result = -1;
        
        while(low<=high){
            int mid = low + ((high - low)/2);
            
            if(isFeasible(arr,n,k,mid)){
                result = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
            
        }
        
        return result;
    }
    
    public static boolean isFeasible(int[] arr, int n, int k, int maxPages){
        int student = 1;
        int currentSum = 0;
        
        for(int i=0;i<n;i++){
            if(currentSum + arr[i]>maxPages){
                student++;
                currentSum = arr[i];
                
                if(student>k) return false;
            }else{
                currentSum += arr[i];
            }
        }
        
        return true;
    }

}
