package arraysPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//This can also be done using an extended version of Boyer-Moore method
//Below is my try
public class MajorityElementII_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2};
		List<Integer> list = majorityElement(nums);
		
		list.stream().forEach(n->System.out.println(n));
	}
	
	public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>n/3) list.add(num);
        }

        return list.stream().distinct().collect(Collectors.toList());
    }

}
