package demo.learn.threads;
class PrinterTask implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Running "+Thread.currentThread().getName()+" "+i);
		}
	}
	
}
public class PrinterTaskExample {

	public static void main(String[] args) throws InterruptedException {
		PrinterTask pt = new PrinterTask();
		Thread threadTask1= new Thread(pt,"threadTask1");
		Thread threadTask2= new Thread(pt,"threadTask2");
		threadTask1.start();
		threadTask2.start();
		threadTask1.join();
		threadTask2.join();
	}
}
