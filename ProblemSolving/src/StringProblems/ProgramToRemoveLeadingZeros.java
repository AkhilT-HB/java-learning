package StringProblems;

/* 
 * Input : 00000123569
Output: 123569

Input: 000012356090
Output: 12356090
 * 
 * 
 */
public class ProgramToRemoveLeadingZeros {

	public static void main(String[] args) {
		String str = "000012356090";
		
		String output="";
		
		int index=0;
		
		for(int i=0;i<str.length();i++) {
			int first = Integer.valueOf(str.charAt(i));
			int second = Integer.valueOf(str.charAt(i+1));
			
			//System.out.println("inside for");
			if((first-second)== 0) {
				
				//System.out.println("inside if");
				index = i+1;
				
				//System.out.println(index);
				continue;
			}else {
				output=str.substring(index+1, str.length());
				System.out.println("output is: "+output);
				break;
			}
			
			
			
		}
	}

}
