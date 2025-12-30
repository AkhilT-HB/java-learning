package recursionAndbacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationsLeetCode {
    static List<List<Integer>> result = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		
		System.out.println(combine(n,k).toString());
	}
	
	public static List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<>();
        backtrack(list,1,n,k);

        return result;
    }

     static void backtrack(List<Integer> list, int start, int n, int k){

        if(list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = start;i<=n;i++){
            list.add(i);
            backtrack(list,i+1,n,k);
            list.remove(list.size()-1);
        }
        
    }

}
