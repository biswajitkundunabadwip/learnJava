package learnJava.collection.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author biswajit
 * 1. does not maintain the insertion order
 * 2. Does not sorted the data element
 * 3. It is not thread safe
 * 4. It much faster than LinkedHashMap
 */
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> newHashMap= new HashMap<>();
		newHashMap.put("Mango",1);  
		newHashMap.put("Apple",2);    
		newHashMap.put("Banana",3);   
		newHashMap.put("Grapes",4);   
		System.out.println(newHashMap);
	}

}
