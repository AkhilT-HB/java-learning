package GFGProblems;
/*
 Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).

Note: The driver code prints "balanced" if function return true, otherwise it prints "not balanced".

Examples :

Input: {([])}
Output: true
Explanation: { ( [ ] ) }. Same colored brackets can form balanced pairs, with 0 number of unbalanced bracket.
Input: ()
Output: true
Explanation: (). Same bracket can form balanced pairs,and here only 1 type of bracket is present and in balanced way.
Input: ([]
Output: false
Explanation: ([]. Here square bracket is balanced but the small bracket is not balanced and Hence , the output will be unbalanced.
*/
import java.util.EmptyStackException;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "{}{((})}";
		if(validation(x)) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
	}
	
	public static boolean validation(String x) {
		Stack<Character> stack = new Stack<>();
		
		if(x.length()==0 || x.length()==1){
            return false;
        }
        
		for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            	stack.push(ch);
            else{   
            	if(stack.isEmpty())return false;
            	
                if((stack.peek()=='(' && ch==')')||(stack.peek()=='{' && ch=='}')||(stack.peek()=='[' && ch==']')) {
                	stack.pop();
                }else {
                	return false;
                }
                  
            }
        }
		
		if(stack.size()==0) {
			return true;
		}
		return false;
	}

}

