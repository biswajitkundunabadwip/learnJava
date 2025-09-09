package learnJava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class LinkedListsDemo {

	public static void main(String[] args) {
		List<String> fruits = List.of("Apple","Banana","Grapes");
		
		List<String> fruitsNewLinkedList = new ArrayList<>(fruits);
		System.out.println("To print all the list "+fruitsNewLinkedList);
	}

}
