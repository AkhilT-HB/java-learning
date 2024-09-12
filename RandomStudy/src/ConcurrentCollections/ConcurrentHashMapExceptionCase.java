package ConcurrentCollections;

//Code with ease - by Varsha [Internal working of ConcurrentHashMap & Interview Questions - java video]

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExceptionCase {

	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<>();
		
		map.put("One",1);
		map.put("two", 2);
		map.put("three",3);
		
		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();// The iterators that hashmap has are fail-fast iterator
		
		while(iterator.hasNext()) {
			Map.Entry<String,Integer> entry = iterator.next();
			if(entry.getKey().equals("two")) {
				map.put("four", 4); //This will throw concurrentModificationException if Hashmap is used
			}
		}
		
		System.out.println(map);
	}

}
