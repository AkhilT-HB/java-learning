package GFGProblems;

import java.util.ArrayList;
import java.util.List;

/*
 Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

Note: The last character has not been '.'. 

Examples :

Input: str = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
Input: str = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole string , the input string becomes mno.pqr
 */
public class StringReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i.like.this.program.very.much";
		
		System.out.println(reverseWords(str));
	}
	
	static String reverseWords(String str) {
        // code here
        List<String> list = new ArrayList<>();
        
        int leftIndex=0;
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch=='.'){
                list.add(str.substring(leftIndex,i));
                leftIndex = i;
            }
            if(i==(str.length())-1){
                list.add(str.substring(leftIndex+1,i+1));
            }
        }
        
        StringBuffer strBuff = new StringBuffer();
        
        for(int i=list.size()-1;i>=0;i--){
            if(i==0){
                strBuff.append(".");
            }
            strBuff.append(list.get(i));
            //strBuff.append(".");
        }
        
        
        
        //System.out.println(strBuff);
        
        return strBuff.toString();
    }

}
