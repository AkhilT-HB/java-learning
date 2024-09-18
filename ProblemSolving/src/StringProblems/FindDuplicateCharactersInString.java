package StringProblems;

import java.util.Arrays;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		String str = "abcdaeb";
		
		char[] chArr = str.toCharArray();
		
		System.out.println(Arrays.toString(chArr));
		
		for(int i=0;i<chArr.length;i++) {
			for(int j=i+1;j<chArr.length;j++) {
				if(chArr[i]==chArr[j]) {
					System.out.println(chArr[i]);
				}
			}
		}
		
	}

}
