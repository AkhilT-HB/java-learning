package arraysPractice;

import java.util.ArrayList;
import java.util.Collections;
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
	
	public static List<Integer> majorityElementBoyerMooreMethod(int[] nums) {
        int n = nums.length;

        if(n==0) return Collections.emptyList();

        int cand1 = 0, cand2 = 0;
        int count1 = 0, count2 =0;

        for(int num : nums){
            if(num == cand1){
                count1++;
            }else if(num == cand2){
                count2++;
            }else if(count1 == 0){
                cand1 = num;
                count1 = 1;
            }else if(count2 == 0){
                cand2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(num==cand1) count1++;
            else if(num==cand2) count2++;
        }

        List<Integer> list = new ArrayList<>();
        if(count1>n/3) list.add(cand1);
        if(count2>n/3) list.add(cand2);

        return list;
    }

}
