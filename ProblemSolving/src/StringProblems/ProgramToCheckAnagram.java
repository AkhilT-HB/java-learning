package StringProblems;

import java.util.Arrays;

public class ProgramToCheckAnagram {

	public static void main(String[] args) {
		String str1="Silent";
		String str2="Listen";
		
		String lstr1 = str1.toLowerCase();
		String lstr2 = str2.toLowerCase();
		
		System.out.println(checkAnagram(lstr1,lstr2));
	}
	
	static boolean checkAnagram(String lstr1, String lstr2) {
		if(lstr1.length() != lstr2.length()) {
			return false;
		}
		
		char[] ch1 = lstr1.toCharArray();
		char[] ch2 = lstr2.toCharArray();
	
		Arrays.sort(ch1);
		Arrays.sort(ch2);
	
		return Arrays.equals(ch1, ch2);
	}

}
