package learnJava.collections.set;

import java.util.List;
import java.util.TreeSet;
/**
 * give me the uniques value with sorted order
 */
public class Exercise {
	public static void main(String[] args) {
		List<Character>chars=List.of('A','Z','A','B','Z','F');
		
		TreeSet<Character>newTreeSetValues= new TreeSet<>(chars);
		
		
		System.out.println(newTreeSetValues);
	}
}
