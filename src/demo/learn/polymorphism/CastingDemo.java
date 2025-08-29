package demo.learn.polymorphism;

class A {
	public void show1() {
		System.out.println("in A");
	}
}

class B extends A {
	public void show2() {
		System.out.println("in B show2");
	}
	public void show1() {
		System.out.println("in B");
	}
}

public class CastingDemo {
	public static void main(String[] args) {
		A a = new B();
		a.show1();
		
		B b=(B)a;
		b.show2();
	}
}
