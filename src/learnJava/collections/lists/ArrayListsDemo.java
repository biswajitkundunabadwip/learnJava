package learnJava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsDemo {

	public static void main(String[] args) {
		List<String> fruits = List.of("Apple","Banana","Grapes");
		
		List<String> fruitsNewArrayList = new ArrayList<>(fruits);
		System.out.println("To print all the list "+fruitsNewArrayList);
		
		/**
		 * To add element it will be appended in the end
		 */
		
		fruitsNewArrayList.add("Guava");
		System.out.println(fruitsNewArrayList);
		/**
		 * To Add the element index wise
		 */
		
		fruitsNewArrayList.add(0, "Dragon fruit");
		System.out.println(fruitsNewArrayList);
		/**
		 * To check whether any element is present or not
		 * It should return value as false 
		 */
		
		System.out.println(fruitsNewArrayList.contains("Cat"));
		
		/**
		 * To know the last index of an array it will return output as -1
		 */
		System.out.println(fruitsNewArrayList.lastIndexOf("reyansh"));
		
		/**
		 * To check the index of element present in the array list
		 */
		System.out.println(fruitsNewArrayList.indexOf("Banana"));
		
		/**
		 * To remove the element from the list which is not there
		 * it will give me an error as false
		 */
		System.out.println(fruitsNewArrayList.remove("Reyansh"));
		
		/**
		 * To remove the element from the index
		 * it will give out put as true
		 */
		fruitsNewArrayList.add("Cucumber");
		System.out.println(fruitsNewArrayList.remove("Cucumber"));
		
		/**
		 * To add the other collection
		 */
		
		List<String> otherFruitsArrayList=new ArrayList<String>();
		otherFruitsArrayList.add("orange");
		otherFruitsArrayList.add("Chicu");
		otherFruitsArrayList.add("Muskmelon");
		otherFruitsArrayList.add("Watermeloon");
		
		fruitsNewArrayList.addAll(otherFruitsArrayList);
		System.out.println("After adding the all fruits collection with other collection   : "+fruitsNewArrayList);
		
		
	}

}
