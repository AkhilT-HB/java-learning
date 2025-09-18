package arraysPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ExerciseIsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5,6};
		
		boolean output = isUniqueUsingHashMap(intArray);
		
		System.out.println(output);

	}
	
	public static boolean isUnique(int[] intArray) {
		//This approach has timecomplexity o(n2), so not ideal
        int count = 0;
        boolean isUnique = false;
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i]==intArray[j]){
                    count++;
                }
            }
        }
        if(count==0){
            return true;
        }else{
            return false;
        }
    }
	
	public static boolean isUniqueSecondApproach(int[] intArray) {
		//This approach has o(n) time complexity 
		Arrays.sort(intArray);

	        for(int j=1;j<intArray.length;j++){
	            if(intArray[j]==intArray[j-1]){
	                return false;
	            }
	        }
	        return true;
	}
	
	public static boolean isUniqueThirdApproach(int[] intArray) {
		//This approach has o(n) time complexity 
		Set s = new HashSet<Integer>();

	        for(int i=0;i<intArray.length;i++){
	            s.add(intArray[i]);
	        }
	        
	        if(s.size()==intArray.length) {
	        	return true;
	        }else {
	        	return false;
	        }
	}
	
	public static boolean isUniqueUsingHashMap(int[] intArray) {
		//This approach has o(n) time complexity 
		HashMap<Integer, Integer> hm = new HashMap<>();

	        for(int i=0;i<intArray.length;i++){
	            int num = intArray[i];
	        	if(hm.containsKey(num)&&hm.get(num)>=1) {
	        		return false;
	        	}else {
	        		hm.put(num, hm.getOrDefault(num, 0)+1);
	        	}
	        }
	        
	        return true;
	        
	       
	}
	
	

}
