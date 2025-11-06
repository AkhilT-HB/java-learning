package stringsPractice;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "egg";
		String t = "add";
		
		System.out.println(isIsomorphic(s,t));
	}
	public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        Map<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
        	char chOfStr1 = s.charAt(i);
        	char chOfStr2 = t.charAt(i);
        	
        	if(map.containsKey(chOfStr1)) {
        		 if(map.get(chOfStr1) != chOfStr2) {
                 	return false;
                 }
        	}else {
        		if(!map.containsValue(chOfStr2)) {
        			//System.out.println(chOfStr1+ " " +chOfStr2);
        			map.put(chOfStr1, chOfStr2);
        		}else {
        			return false;
        		}
        		
        	}
 
        }
        
        return true;
    }
}
