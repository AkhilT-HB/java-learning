package RandomProblems;

public class CheckPalindrom {

	public static void main(String[] args) {
		String str = "Hannah";
		
		System.out.println(isPalindrome(str.toLowerCase()));
		
		
		
	}
	
	public static boolean isPalindrome(String str){
		int j=str.length()-1;
		
		for(int i=0;i<j;i++){
			j=j-i;
			
			if(str.charAt(i)!=str.charAt(j)){
				return false;
			}
			
		}
		return true;
	}

}
