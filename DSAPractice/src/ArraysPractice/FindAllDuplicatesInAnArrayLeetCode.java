package arraysPractice;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArrayLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> result = findDuplicates(nums);
		
		result.stream().forEach(n -> System.out.println(n));
	}
	public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index]>0){
                nums[index] = -1 * nums[index];
            }else{
                list.add(Math.abs(nums[i]));
            }
        }

        return list;
    }

}
