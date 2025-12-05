package stringsPractice;

import java.util.HashSet;

public class SubstringsWithKDistinctGFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		int k = 2;
		
		System.out.println(countSubstr(s,k));
	}
	
	public static int countSubstr(String s, int k) {
        //  code here
        return atmost(s,k)-atmost(s,k-1);
    }

	private static int atmost(String s, int k) {
		// TODO Auto-generated method stub
		int n = s.length();
		
		if(k==0) return 0;
		
		int count = 0;
		int left = 0;
		int distinct = 0;
		int[] freq = new int[128];
		
		for(int right=0;right<n;right++) {
			char c = s.charAt(right);
			
			if(freq[c]==0) {
				distinct++;
			}
			freq[c]++;
			
			while(distinct>k) {
				char leftChar = s.charAt(left);
				freq[leftChar]--;
				if(freq[leftChar]==0) {
					distinct--;
				}
				left++;
			}
			
			count += (right - left + 1);
		}
		
		return count;
	}

}
