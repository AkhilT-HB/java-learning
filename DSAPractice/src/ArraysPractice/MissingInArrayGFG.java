package arraysPractice;

public class MissingInArrayGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,5};
		System.out.println(missingNum(arr));
	}
	static int missingNum(int arr[]) {
        // code here
        
        int n = arr.length+1;
        long totalSum = ((long) n * (n+1))/2;
        long sum = 0;
        for (int num : arr) sum += num;
        int result = (int) (totalSum - sum);
        return result;
    }

}
