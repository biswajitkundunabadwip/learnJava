package learnJava.threads;

class Counter {
	int count;

	public synchronized void  increment() {
		count++;
	}
}

public class RunnableVsThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c = new Counter();

		Runnable obj1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		};
		Runnable obj2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		};

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(c.count);
	}

}
