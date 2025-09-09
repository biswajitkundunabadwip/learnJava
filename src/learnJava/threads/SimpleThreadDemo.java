package learnJava.threads;

class A extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			dispA();
		}
	}
	
	public void dispA() {
		System.out.println("hi");
	}
}

class B extends Thread{
	public void run() {
		for(int i =0;i<10;i++) {
			dispB();
		}

	}
	public void dispB() {
		System.out.println("Hello");
	}
}

public class SimpleThreadDemo {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(a.getPriority());
		System.out.println(b.getPriority());
		b.setPriority(Thread.MAX_PRIORITY);
		
		a.start();
		b.start();
	}

}
