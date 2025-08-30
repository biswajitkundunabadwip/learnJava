package demo.learn.threads;
class AB implements Runnable{
	public void run() {
		for(int i =0;i<10;i++) {
			dispA();
		}
	}
	
	public void dispA() {
		System.out.println("hi");
	}
}

class BA implements Runnable{
	public void run() {
		for(int i =0;i<10;i++) {
			dispB();
		}

	}
	public void dispB() {
		System.out.println("Hello");
	}
}
public class RunnableVsThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj1= new AB();
		Runnable obj2= new BA();
		
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		t1.start();
		t2.start();
	}

}
