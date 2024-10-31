package StringProblems;

public class ProgramToRemoveTrailingZeros {

	public static void main(String[] args) {
		String str = "1235609000";
		
		int index=0;
		
		for(int i=str.length()-1;i>1;i--) {
			if(str.charAt(i)=='0' && (str.charAt(i-1)-str.charAt(i)==0)) {
				index++;
			}
		}
		
		
		index = str.length() - (index+1);
		
		System.out.println(index);
		
		System.out.println(str.substring(0, index));
	}

}
