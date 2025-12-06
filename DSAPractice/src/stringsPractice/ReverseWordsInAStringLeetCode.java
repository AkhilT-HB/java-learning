package stringsPractice;

public class ReverseWordsInAStringLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a good   example";
		//String s = "  hello world  ";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		String[] strSplit = s.trim().split("\\s+");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=strSplit.length-1;i>=0;i--) {
			sb.append(strSplit[i]);
            if (i > 0) sb.append(" ");
			

		}
		
		return sb.toString();
 	}	

}
