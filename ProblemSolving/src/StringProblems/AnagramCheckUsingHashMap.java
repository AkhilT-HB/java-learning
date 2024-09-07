package StringProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AnagramCheckUsingHashMap {

	public static void main(String[] args) {

		
		String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";
 
        // Function call
        if (areAnagram(str1, str2))
            System.out.print("The two strings are "
                             + "anagram of each other");
        else
            System.out.print("The two strings are "
                             + "not anagram of each other");

	}

	private static boolean areAnagram(String a, String b) {
		
		if (a.length() != b.length()) {
            return false;
        }
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length();i++) {
			if(map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}else {
				map.put(a.charAt(i), 1);
			}
		}
	
		for(int i=0;i<b.length();i++) {
			if(map.containsKey(b.charAt(i))) {
				map.put(b.charAt(i), map.get(b.charAt(i))-1);
			}
		}
		
		
		Set<Character> keys = map.keySet();
		
		System.out.println("keys are: "+keys);

		for(Character key : keys) {
			if(map.get(key)!=0) {
				return false;
			}
		}
		
		return true;
	}

}
