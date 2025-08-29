package demo.learn.abstraction;

/**
 * 1. We can not instantiate the abstract class 2. We can use as reference of
 * abstract class 3. it can also have normal method,constructor 4. class which
 * extending the abstract class either has to do the implementation or neeed make
 * itself as abstract
 */
abstract class Parent {

	public Parent() {
		System.out.println("This is from abstract parent class : ");
	}

	abstract public void eat();

	public void work() {
		System.out.println("work from parent class"+Parent.class.getName());
	}

}

/**
 * as i have not not implemented
 */

abstract class Child extends Parent {
	public void cdisp() {
		System.out.println("I am from " + Child.class.getName());
	}
}

class AbstractDemo extends Child {
	@Override
	public void eat() {
		System.out.println("i got implmeneted in "+AbstractDemo.class.getName());
	}
	public static void main(String[] args) {
		Child child = new AbstractDemo();
		child.eat();
	}
}
