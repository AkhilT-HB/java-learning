package StringProblems;
/*
 * Input: str = "Geeks for geeks" , index = 10 , ch = 'G'

Output: "Geeks for Geeks"

Explanation:  String str is "Geeks for geeks" , as we can see index 10 refers to "Geeks for geeks" this element . So , we will replace it with 'G'.
                         Result becomes "Geeks for Geeks"
 * 
 * 
 */

public class ProgramToReplaceCharacterAtSpecificIndex {

	public static void main(String[] args) {
		
		String str = "Geeks_for_geeks" ; 
		int index = 10 ;
		char ch = 'G';
		
		String first = str.substring(0, index);
		String second = str.substring(index+1,str.length());
		
		System.out.println(first);
		System.out.println(second);
		
		String output=first+ch+second;
		
		System.out.println(output);
		
		
		
	}

}
