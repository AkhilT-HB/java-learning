package RandomProblems;

public class CheckVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insta code_chunks reel
		//Count vowels and consonants in a given java string
		
		String str = "Chak De! India";
		
		String small=str.toLowerCase();
	
		int vowels=0;
		int consonants=0;
		
		for(int i=0;i<small.length();i++) {
			char ch = small.charAt(i);
			if(ch!=' '&& (ch>='a' && ch<='z')){
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		

		System.out.println(vowels +" "+consonants);

	}

}
