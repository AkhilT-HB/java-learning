package RandomProblems;

public class UserNamePattern {
	public static boolean validate(String username) {
        
        
        if(username.length()>=6 && username.length()<=20 && validateDotCount(username)==1){
            
        	if(username.contains(" ")) {
        		return false;
        	}else if(username.startsWith(".")  || startsWithNum(username)) {
        		return false;
        	}
            
            
        }
            return true;
        
    }
	
	public static int validateDotCount(String username) {
		int dotCount=0;
        for(int i=0;i<username.length();i++) {
        	char ch=username.charAt(i);
        	if(ch == '.') {
        		dotCount++;
        	}
        }
        return dotCount;
	}
	
	public static boolean startsWithNum(String username){

        String firstChar = username.substring(0, 1);
        
        if(firstChar.contains("^[0-9]^")) {
        	return true;
        }
        
        return false;
    }

	public static void main(String[] args) {
        System.out.println(validate("Robert.Domek")); // Valid username, returns true
        System.out.println(validate("Robert Domek")); // Invalid username, returns false
    }

}
