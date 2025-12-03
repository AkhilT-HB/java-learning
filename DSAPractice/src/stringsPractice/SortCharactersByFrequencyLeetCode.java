package stringsPractice;

import java.util.ArrayList;
import java.util.List;

public class SortCharactersByFrequencyLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "loveleetcode";
		
		System.out.println(frequencySort(s));
	}
	
	public static String frequencySort(String s) {
        if(s == null || s.length() == 1) return s;
        int n = s.length();
        int[] freq = new int[128];
        
        for(char c : s.toCharArray()) {
        	freq[(int) c]++;
        }
        
        List<Character>[] buckets = new ArrayList[n+1];
        for(int i=0;i<=n;i++) buckets[i] = new ArrayList<>();
        
        for(int i=0;i<128;i++) {
        	int f = freq[i];
        	if(f>0) buckets[f].add((char)i); 
        }
        
        StringBuilder sb = new StringBuilder(n); 
        for(int count=n;count>=1;count--) {
        	for(char ch : buckets[count]) {
        		for (int k = 0; k < count; k++) sb.append(ch);
        	}
        }
        
        return sb.toString();
    }

}
