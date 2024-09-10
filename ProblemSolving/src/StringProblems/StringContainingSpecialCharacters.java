package StringProblems;

import java.util.Stack;

/* Given a String containing just the characters '(', ')','{','}','[',']', determine if the input string is valid.
 * An input string is valid if :
 * - Open brackets must be closed in the correct order. 
 * - Every close bracket has a corresponding open bracket of the same type.
 * 
 * ex - input s='(){}[]' output = true
 * ex - input s='(]' output = false
 *  */


public class StringContainingSpecialCharacters {

	public static void main(String[] args) {
		String input = "(]";
		boolean status = validateCharacter(input);
		System.out.println(status);
	}
	
	public static boolean validateCharacter(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			
			if(ch==')') {
				if(stack.peek()=='(') {
					stack.pop();
				}
			}else if(ch=='}') {
				if(stack.peek()=='{') {
					stack.pop();
				}
			}else if(ch==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}
			}else {
				stack.push(ch);
			}
		}
		
		if(stack.size()==0) {
			return true;
		}
		
		return false; 
		
	}

}
