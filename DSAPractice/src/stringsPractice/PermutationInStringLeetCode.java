package stringsPractice;

public class PermutationInStringLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "eidbaooo";
		
		System.out.print(checkInclusion(s1, s2));
	}
	
	public static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] window = new int[26];

        for(char ch : s1.toCharArray()){
            freq1[ch - 'a']++;
        }
        int n = s1.length();

        for(int i=0;i<n;i++){
            window[s2.charAt(i) - 'a']++;
        }

        if(isMatching(freq1,window)) return true;

        for(int i=n;i<s2.length();i++){
            window[s2.charAt(i) - 'a']++;

            window[s2.charAt(i-n) - 'a']--;

            if(isMatching(freq1,window)) return true;
        }

        return false;

    }

    public static boolean isMatching(int[] freq1,int[] window){
        for(int i=0;i<26;i++){
            if(freq1[i] != window[i]) return false;
        }
        return true;
    }

}
