package stringsPractice;

public class MaximumNestingDepthOfTheParenthesesLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));
	}
	public static int maxDepth(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        int max = 0;
        for(char c : ch){
            if(c == '(') count++;
            else if(c==')') count--;

            max = Math.max(max,count);
        }

        return max;
    }
}
