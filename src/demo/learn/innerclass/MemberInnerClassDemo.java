package demo.learn.innerclass;

class A {
	private int i = 10;

	class B {
		public void disp() {
			System.out.println("the value of i is " + i);
		}
	}
}

public class MemberInnerClassDemo {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		
		b.disp();
	}

}
