package recursionAndbacktracking;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatchLeetCodeBackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(readBinaryWatch(2).toString());
	}
	
    static List<String> list = new ArrayList<>();
    public static List<String> readBinaryWatch(int turnedOn) {
        backtrack(0,0,0,turnedOn);
        return list;
    }

    static void backtrack(int index, int hour, int minute, int turnedOn){

        int[] hrs = {8,4,2,1};
        int[] mins = {32,16,8,4,2,1};

        if(hour > 11 || minute > 59){
            return;
        }

        if(index == 10){
            if(turnedOn == 0){
                list.add(hour+":"+String.format("%02d",minute));
            }
            return;
        }

        if(turnedOn == 0){
            list.add(hour+":"+String.format("%02d",minute));
            return;
        }

        if(index < 4){
            backtrack(index+1,hour+hrs[index],minute,turnedOn-1);
        }else{
            backtrack(index+1,hour,minute+mins[index-4],turnedOn-1);
        }

        backtrack(index+1,hour,minute,turnedOn);
    }

}
