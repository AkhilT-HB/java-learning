package arraysPractice;
// Refer : https://www.geeksforgeeks.org/dsa/maximum-product-subarray/
public class MaximumProductSubArrayLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
	}
    public static int maxProduct(int[] nums) {

        if(nums.length == 1) return nums[0];

        int currentMax = nums[0];
        int currentMin = nums[0];
        int maxProduct = nums[0];

        for(int i=1;i<nums.length;i++){
            int temp = max(nums[i],nums[i]*currentMax,nums[i]*currentMin);

            currentMin = min(nums[i],nums[i]*currentMax, nums[i]*currentMin);

            currentMax = temp;

            maxProduct = Math.max(maxProduct, currentMax);
        }

        return maxProduct;
    }

    public static int max(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }

    public static int min(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }
}
