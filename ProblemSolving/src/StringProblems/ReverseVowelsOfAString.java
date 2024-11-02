package StringProblems;
/*
LeetCode 345. Reverse Vowels of a String

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"
*/
public class ReverseVowelsOfAString {

	public static void main(String[] args) {
		String s = "IceCreAm";
		
		
		System.out.println(reverseVowels(s));
		
	}
	
	public static String reverseVowels(String s) {
		char[] ch = s.toCharArray();
		String vowels = "aeiouAEIOU";
		int start = 0;
		int end = s.length()-1;
		
		while(start < end) {
			
			while(start < end && vowels.indexOf(ch[start])== -1) {
				start++;
			}
			
			while(start < end && vowels.indexOf(ch[end])== -1) {
				end--;
			}
			
			char tempCh = ch[start];
			ch[start] = ch[end];
			ch[end] = tempCh;
			
			start++;
			end--;
			
		}
		
		String answer = new String(ch);
		
		return answer;
    }

}
