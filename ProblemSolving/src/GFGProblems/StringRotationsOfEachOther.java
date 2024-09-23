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
        
        StringBuffer str1 = new StringBuffer(s1);
        StringBuffer str2 = new StringBuffer(s2);
        
        
        
        
        if(s1.contains(s2)) {
        	return true;
        }
        
        return true;
    }
}
