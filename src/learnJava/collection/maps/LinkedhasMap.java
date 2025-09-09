package learnJava.collection.maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author biswajit
 * 1. does maintain the insertion order
 * 2. Does not sorted the data element
 * 3. It is not thread safe
 * 4. It much faster than LinkedHashMap
 */
public class LinkedhasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> newLinkedHashMap= new LinkedHashMap<>();
		newLinkedHashMap.put("Mango",1);  
		newLinkedHashMap.put("Apple",2);    
		newLinkedHashMap.put("Banana",3);   
		newLinkedHashMap.put("Grapes",4);   
		System.out.println(newLinkedHashMap);
		System.out.println("Some common functionality acrros the Map interface");
		System.out.println("To printout the values of key : "+newLinkedHashMap.values());
		System.out.println("To printout the keys  : "+newLinkedHashMap.keySet());
		System.out.println("To check contain the key in : "+newLinkedHashMap.containsKey("Mango"));
		System.out.println("To check when contain the key is not there : "+newLinkedHashMap.containsKey("Cat"));
		System.out.println("To check contain the key values is there : "+newLinkedHashMap.containsValue(4));
		System.out.println("To check contain the key values not there : "+newLinkedHashMap.containsValue(9));
		
		System.out.println("To get the key  : "+newLinkedHashMap.get("Grapes"));
		System.out.println("To get the key when its not there  : "+newLinkedHashMap.get("banana"));
	}

}
