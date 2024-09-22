package GFGProblems;

import java.util.HashMap;
import java.util.Map;

public class StringIsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "pijthbsfy";
		String str2 = "fvladzpbf";
		
		System.out.println(areIsomorphic(str1,str2));
	}
	public static boolean areIsomorphic(String str1,String str2)
    {
        if(str1.length() != str2.length()){
            return false;
        }
        
        Map<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<str1.length();i++){
        	char chOfStr1 = str1.charAt(i);
        	char chOfStr2 = str2.charAt(i);
        	
        	if(map.containsKey(chOfStr1)) {
        		 if(map.get(chOfStr1) != chOfStr2) {
                 	return false;
                 }
        	}else {
        		if(!map.containsValue(chOfStr2)) {
        			System.out.println(chOfStr1+ " " +chOfStr2);
        			map.put(chOfStr1, chOfStr2);
        		}else {
        			return false;
        		}
        		
        	}
 
        }
        
        return true;
        
    }

}
