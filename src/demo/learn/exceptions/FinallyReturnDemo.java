package demo.learn.exceptions;

public class FinallyReturnDemo1 {
	public static int testMethod() {
		try {
			System.out.println("Inside try");
			return 1;
		} catch (Exception e) {
			System.out.println("Inside catch");
			return 2;
		} finally {
			System.out.println("Inside finally");
		}
	}
}

public class FinallyReturnDemo {
	public static int testMethodnew() {
		try {
			System.out.println("Inside try");
			return 1;
		} catch (Exception e) {
			System.out.println("Inside catch");
			return 2;
		} finally {
			System.out.println("Inside finally");
			return 3; // Overrides everything
		}
	}

	public static void main(String[] args) {
		System.out.println("Returned: " + FinallyReturnDemo1.testMethod());
		System.out.println("Returned: " + FinallyReturnDemo.testMethod());
	}
}
