package learnJava.innerclass;
@FunctionalInterface
interface FlyingObject {
	void fly();
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingObject flyingObject= ()->System.out.println("Aeroplane flying");
		flyingObject.fly();
	}

}
