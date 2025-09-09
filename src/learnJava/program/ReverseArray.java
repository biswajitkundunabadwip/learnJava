package learnJava.program;

public class ReverseArray {
	public static void main(String[] args) {
		int arrayNumber[]= {1,2,3,4,5,6};
		System.out.println(arrayNumber.length);
		for(int i=arrayNumber.length-1;i>=0;i--) {
			System.out.println(arrayNumber[i]);
		}
	}
}
