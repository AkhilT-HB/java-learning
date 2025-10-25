package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingElementsOfAnArrayByFrequencyGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        int[] result = sortByFrequency(arr);

        System.out.println(Arrays.toString(result));
	}

	private static int[] sortByFrequency(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
		for(int num : arr) {
			freqMap.put(num,freqMap.getOrDefault(num,0)+1);
		}
		
		List<Integer> list = new ArrayList<>();
		for(int num : arr) {
			list.add(num);
		}
		
		Collections.sort(list, (a,b)-> {
			int freqA = freqMap.get(a);
			int freqB = freqMap.get(b);
			
			if(freqA!=freqB) return freqB-freqA;
			
			return a-b;
		});
		
		int[] result = new int[arr.length];
		for(int i = 0;i<list.size();i++) {
			result[i]=list.get(i);
		}
		return result;
	}

}
