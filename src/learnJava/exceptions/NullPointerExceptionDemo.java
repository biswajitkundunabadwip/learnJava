package learnJava.exceptions;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		
		try {
			System.out.println("lenght of String is"+name.length());
		}catch (NullPointerException e) {
			System.out.println("null pinter demo");
			System.out.println(e);
		}
				
				
	}

}
