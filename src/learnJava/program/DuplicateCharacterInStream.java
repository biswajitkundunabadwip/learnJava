package learnJava.program;

import java.util.HashMap;

public class DuplicateCharacterInStream {
	public static void main(String[] args) {
		String str = "This is new world of programming";

		char[] characters = str.toCharArray();
		HashMap<Character, Integer> occurences = new HashMap<>();
		for (char character : characters) {
			// get the character
			Integer integer = occurences.get(character);
			// the increment the counter
			if (integer == null) {
				occurences.put(character, 1);
			} else {
				occurences.put(character, integer + 1);
			}
		}

		System.out.println(occurences);
	}
}
