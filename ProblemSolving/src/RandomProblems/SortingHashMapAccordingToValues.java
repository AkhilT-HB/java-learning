package RandomProblems;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortingHashMapAccordingToValues {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 
        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        
        Map<String, Integer> hm1 = sortByValue(hm);
 
        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() + 
                          ", Value = " + en.getValue());
        }
	}

	private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		
		Collections.sort(list, (obj1, obj2) -> (obj1.getValue()).compareTo(obj2.getValue()) );
		
		HashMap<String, Integer> newHm = new LinkedHashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> mapEntry : list) {
			newHm.put(mapEntry.getKey(), mapEntry.getValue());
		}
		
		return newHm;
	}

}
//new Comparator<Map.Entry<String, Integer>>(){
//	public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
//		return (obj1.getValue()).compareTo(obj2.getValue());
//	}
//}