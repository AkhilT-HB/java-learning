package StringProblems;

import java.util.Arrays;

/*Input: str = “GeeksForGeeks”

Output: eGkeFsroeGkes

Explanation: Swap Pair of Characters 
                        Pairs to Swap: {G e} , {e k} , { s F } , { o r } , { G e } , { e k } , { s }
                        After Swap: { e G } , { k e } , { F s } , { r o } , { e G } , { k e } , { s }
                        Result: " eGkeFsroeGkes " 
*/

public class SwappingPairOfCharacters {

	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		
		char[] chArr = str.toCharArray();
		
		for(int i=1;i<chArr.length;i++) {
			if(i%2!=0) {
				char temp;
				temp=chArr[i];
				chArr[i]=chArr[i-1];
				chArr[i-1]=temp;
			}
		}
		
		
		String swappedStr = new String(chArr);
		
		System.out.println(swappedStr);
	}

}
