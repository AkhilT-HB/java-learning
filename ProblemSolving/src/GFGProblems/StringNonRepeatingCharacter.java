package GFGProblems;
/*
 * Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.

Note: When you return '$' driver code will output -1.

Examples:

Input: s = hello
Output: h
Explanation: In the given string, the first character which is non-repeating is h, as it appears first and there is no other 'h' in the string.
Input: s = zxvczbtxyzvy
Output: c
Explanation: In the given string, 'c' is the character which is non-repeating. 
 */

import java.util.HashMap;
import java.util.Map;

public class StringNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "zxvczbtxyzvy";
		
		char output = nonrepeatingCharacter(s);
		
		System.out.println(output);
	}
	
	static char nonrepeatingCharacter(String s) {
        // Your code here
		
		char[] chArr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<chArr.length;i++) {
			char ch = chArr[i];
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(map.get(ch)==1) {
				return ch;
			}
		}
		
		return '$';
    }
}

//List<Character> list = new ArrayList<>();
//
//char output='$';
// 
//int count = 1;
//for(int i=0;i<chArr.length;i++) {
//	
//	char ch = chArr[i];
//	for(int j=i+1;j<chArr.length;j++) {
//		
//		if(ch == chArr[j]) {
//			count++;
//		}
//	
//	}
//	System.out.println("ch is: "+ch+" count is: "+count);
//	
//	
//	if(count > 1) {
//		count = 1;
//	}else {
//		//list.add(ch);
//		output=ch;
//		break;
//	}
//}
////System.out.println(list);
//return output;