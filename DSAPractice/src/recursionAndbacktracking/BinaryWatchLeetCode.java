package recursionAndbacktracking;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatchLeetCode {

	public static void main(String[] args) {
		int turnedOn = 1;
		
		System.out.println(readBinaryWatch(turnedOn).toString());
	}
	
	 public static List<String> readBinaryWatch(int turnedOn) {
	        List<String> list = new ArrayList<>();

	        for(int hour=0;hour<12;hour++){
	            for(int min=0;min<60;min++){
	                int bits = Integer.bitCount(hour) + Integer.bitCount(min);

	                if(bits == turnedOn){
	                    list.add(hour + ":" + String.format("%02d", min));
	                }
	            }
	        }

	        return list;
	}

}
