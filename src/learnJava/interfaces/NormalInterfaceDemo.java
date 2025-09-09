package learnJava.interfaces;
interface Machine{
	void work();
	void display();
}

class Tv implements Machine{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Tv button and remote is functioning");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("we are able to watch diplay from tv");
	}
	
}
public class NormalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine = new Tv();
		machine.work();
		machine.display();
	}

}
