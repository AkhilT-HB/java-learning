package arraysPractice;

public class RotateArrayLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-100,3,99};
		int k = 2;
		
		rotate(nums,k);
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void rotate(int[] nums, int k) {
		int[] subArrayB = new int[k];
        int j = subArrayB.length - 1;
        for(int i = nums.length-1;i>=nums.length-k;i--){
             subArrayB[j--] = nums[i];
        }

        int[] subArrayA = new int[k+1];
        for(int i = 0;i<=k;i++){
            subArrayA[i] = nums[i];
        }

        for(int i = 0;i<k;i++){
            nums[i] = subArrayB[i];
        }

        int start = 0;
        for(int i = k;i<nums.length;i++){
            nums[i] = subArrayA[start];
            start++;
        }
    }
}
