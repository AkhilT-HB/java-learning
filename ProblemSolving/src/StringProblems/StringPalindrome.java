package StringProblems;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "abba";
		
		boolean output=false;
		
		StringBuffer newString = new StringBuffer(str);
		
		newString.reverse();
		
		System.out.println(newString);
		
		System.out.println(str.contentEquals(newString));
		
		//if(str.equals(newString)) {output=true;}
		
		//System.out.println(output);
	}

}
