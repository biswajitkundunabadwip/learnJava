package learnJava.string;

public class StringJoinExample {
	public static void main(String[] args) {
		String firstName = "Manoj";
		String lastName = "Mamilla";
		// Using String.join for concatenation with a delimiter
		String result = String.join("_", "Hello,", firstName, lastName);
		System.out.println(result);
	}
}
