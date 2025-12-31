package recursionAndbacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIIILeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int k = 18;
		String answer = combinationSum3(n,k).toString();
		System.out.println(answer);
	}
	
    static List<List<Integer>> result =  new ArrayList<>();
    public static List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(new ArrayList<>(),0,1,k,n);
        return result;
    }

    static void backtrack(List<Integer> list, int sum, int start, int k, int n){

        if(list.size() == k && sum < n){
            list.remove(list.size()-1);
            return;
        }

        if(list.size() == k && sum == n){
            result.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }

        for(int i = start; i<=9; i++){
            if(sum+i<=n){
                list.add(i);
                backtrack(list,sum+i,i+1,k,n);
            }
        }
        if(list.isEmpty()) {
        	return;
        }else {
            list.remove(list.size()-1);        	
        }

    }

}
