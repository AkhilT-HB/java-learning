package recursionAndbacktracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(generateParenthesis(n));
	}
	
	static List<String> list = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        backtrack("",0,0,n);
        return list;                                           
    }

    static void backtrack(String current, int open, int close, int n){
        if(current.length()==2*n){
            list.add(current);
            return;
        }
        if(open < n){
            backtrack(current+"(",open+1,close,n);
        }
        if(close < open){
            backtrack(current+")",open,close+1,n);
        }
    }

}
