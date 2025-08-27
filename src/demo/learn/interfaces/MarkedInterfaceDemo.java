package demo.learn.interfaces;
@FunctionalInterface
interface Animal{
	void eat();
}

class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	
}
public class MarkedInterfaceDemo {

	public static void main(String[] args) {
		Animal animal= new Dog();
		animal.eat();
	}

}
