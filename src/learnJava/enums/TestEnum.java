package learnJava.enums;

public class TestEnum {
	public static void main(String[] args) {
		Status status=Status.valueOf("Pending");
		System.out.println(status);
	}
}
