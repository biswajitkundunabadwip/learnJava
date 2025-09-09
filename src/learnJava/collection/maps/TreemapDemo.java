package learnJava.collection.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo {
/**
 * 1. it does not maintain the insertion order
 * 2. It maintain the sorted order
 * 
 * @param args
 */
	public static void main(String[] args) {
		Map<String, Integer> newTreeMap= new TreeMap<>();
		newTreeMap.put("Z", 3);
		newTreeMap.put("M", 4);
		newTreeMap.put("A", 5);
		newTreeMap.put("F", 2);
		
		System.out.println(newTreeMap);
	}

}
