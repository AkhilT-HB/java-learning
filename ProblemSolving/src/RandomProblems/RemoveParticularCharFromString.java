package RandomProblems;

//If we have a string, then the que is to remove a particular character from tht string and print

public class RemoveParticularCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "CloudTech";
		
		String result = removeChar(str, 'c');
		
		System.out.println(result);

	}
	
	public static String removeChar(String str, char ch) {
		String newStr="";
		
		String smallStr=str.toLowerCase();
		
		for(int i=0;i<smallStr.length();i++) {
			if(smallStr.charAt(i)!=ch) {
				newStr=newStr+smallStr.charAt(i);
			}
		}
		
		return newStr;
	}

}
