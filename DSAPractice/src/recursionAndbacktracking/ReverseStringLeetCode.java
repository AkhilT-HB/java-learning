package recursionAndbacktracking;
//Can use two pointer approach also
public class ReverseStringLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
		
		reverseString(s);
	}
	
	public static void reverseString(char[] s) {

        reverse(s,0,s.length-1);
        
    }

    static void reverse(char[] s,int i,int j){
        if(i>=j){
            return;
        }
        
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        reverse(s,i+1,j-1);
    }

}
