package learnJava.program;

import java.util.Arrays;

public class StringAnagram {

	public static void anagram(String str1, String str2) {
		char[] newstr1 = str1.toLowerCase().toCharArray();
		char[] newstr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(newstr1);
		Arrays.sort(newstr2);
		if (Arrays.equals(newstr1, newstr2)) {
			System.out.println("String is annagram");
		} else {
			System.out.println("String is not anagram");
		}
	}

	public static void main(String[] args) {
		String str1 = "MOT";
		String str2 = "toma";
		
		anagram(str1, str2);

	}
}
