package StringProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenLengthWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is a java language";
		
		String output = "";
		
		List<String> list = new ArrayList();
		
		String[] splitStr = s.split(" ");
		
		System.out.println(Arrays.toString(splitStr));
		
		for(int i=0;i<splitStr.length;i++) {
			if(splitStr[i].length()%2==0) {
				output = output+" "+splitStr[i];
			}
		}

		
		System.out.println(output);

	}

}
