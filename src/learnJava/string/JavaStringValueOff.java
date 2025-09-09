package learnJava.string;

public class JavaStringValueOff {
	public static void main(String[] args) {
		char[] charArr = { 'b', 'i', 's', 'w', 'a', 'j', 'i', 't' };
		String.valueOf(charArr);
		
		System.out.println(String.valueOf(charArr));
		
		System.out.println(String.copyValueOf(charArr));
	}
}
