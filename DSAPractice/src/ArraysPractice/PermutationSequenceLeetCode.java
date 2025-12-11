package arraysPractice;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequenceLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=9;
		System.out.println(getPermutation(4,9));
	}
	public static String getPermutation(int n, int k) {
        
        List<Integer> nums = new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }

        int[] fact = new int[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++){
            fact[i]=i*fact[i-1];
        }

        k--;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int block = fact[n-1];
            int index = k/block;
            sb.append(nums.get(index));
            nums.remove(index);
            k=k%block;
            n--;
        }

        return sb.toString();
        
    }

}
