package GFGProblems;

import java.util.HashMap;

public class StringRomanNumberToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToDecimal("II"));
	}
	
	public static int romanToDecimal(String str) {
        // code here
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		int sum=0;
		int i=0;
		
//		if(str.length() == 1){
//		    char ch = str.charAt(0);
//		    sum = map.get(ch);
//		}else{
			while(i < str.length()-1) {
				char ch = str.charAt(i);
				if(map.get(ch) >= map.get(str.charAt(i+1))) {
					 sum = sum+map.get(ch);
					 i++;
				}else {
					sum = sum + map.get(str.charAt(i+1));
					sum = sum - map.get(ch);
					
					i+=2;
				}
			}
			
			if(i-1!=str.length()-1) {
				sum=sum + map.get(str.charAt(i));
			}
//		}
		
		
		
	
		
		return sum;
		
    }

}
