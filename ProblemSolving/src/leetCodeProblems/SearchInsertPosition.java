package leetCodeProblems;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int target = 1;
		
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		
		int n = nums.length;
		int i=0;
		int j=1;
		
		if(target<nums[0]){
            return 0;
        }else if(n==1 && target<=nums[0]){
            return 0;
        }else if(n==1 && target>nums[0]){
            return 1;
        }
		
		while(j<n) {
			if(nums[i]==target) {
				return i;
			}else if(nums[j]==target) {
				return j;
			}else if(nums[i]<target && nums[j]>target) {
				return j;
			}else {
				i++;
				j++;
			}
		}
		return j;
	}
}
