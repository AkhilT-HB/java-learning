package GFGProblems;

public class StringRotationsOfEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(areRotations("mightandmagic", "andmagicmigth"));
	}
	
	public static boolean areRotations(String s1, String s2)
    {
        if(s1.length() != s2.length()) {
        	return false;
        }
        
        String concat=s1+s1;
        int len=0;
        for(int i=0;i<concat.length();i++){
            if(len==s2.length()) break;
            if(concat.charAt(i)==s2.charAt(len)) len++;
        }
        return len==s2.length();
    }
}
