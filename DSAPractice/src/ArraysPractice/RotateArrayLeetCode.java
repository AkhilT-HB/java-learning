package arraysPractice;

public class RotateArrayLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1};
		int k = 2;
		
		rotate(nums,k);
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void rotate(int[] nums, int k) {
        while(k>nums.length) k = k - nums.length;

        reverse(nums,0,nums.length - 1);

        reverse(nums,0,k-1);

        reverse(nums,k,nums.length-1);

    }

    public static void reverse(int[] nums, int start, int end){
        
        int j = end;
        for(int i = start;i<j;i++){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j--;
        }
    }
}
