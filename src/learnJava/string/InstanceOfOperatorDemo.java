package learnJava.string;

class Animal {
	void sound() {
		System.out.println("Some animal sound");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}
}

public class InstanceOfOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal myAnimal = new Dog();  // Upcasting (Dog → Animal)

        if (myAnimal instanceof Dog) {  // Check before downcasting
            Dog myDog = (Dog) myAnimal;  // Downcasting (Animal → Dog)
            myDog.bark();                // Now you can call Dog methods
        } else {
            System.out.println("Not a Dog");
        }
	}

}
