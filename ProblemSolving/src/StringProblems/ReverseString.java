package StringProblems;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Geeks", nstr = "";
		
		//using normal way
		char ch;

		System.out.print("Original word: ");
		System.out.println("Geeks"); // Example word

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);
		
		//using bytes array
		byte[] bytes = str.getBytes();
		byte[] revbytes = new byte[bytes.length];

		for (int i = 0; i < bytes.length; i++) {
			revbytes[i] = bytes[bytes.length - (i + 1)];
		}

		System.out.println(new String(revbytes));
		
		//Using String Buffer
		StringBuffer strBuff = new StringBuffer(str);

		System.out.println(strBuff.reverse());
		
		//Using character array, converting the string to charArray
		char[] chArr = str.toCharArray();

		String revStrCh = new String();

		for (int i = 0; i < chArr.length; i++) {
			revStrCh = revStrCh + chArr[chArr.length - (i + 1)];
		}

		System.out.println(revStrCh);
		
		//Using stack
		String s="Geeks For Geeks";
		
		Stack stack = new Stack();
		
		
		for(char c : s.toCharArray()) {
			stack.push(c);
		}
		
		String reverse = new String();
		
		while(!stack.isEmpty()) {
			reverse=reverse+stack.pop();
		}
		
		System.out.println("reverse using stack is: "+reverse);
	}

}
