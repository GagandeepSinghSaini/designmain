package behaviorable.strategy;

public class Client {

	public static void main(String[] args) {
		Duck myduck = new DuckA();
		myduck.setFlyBehavior(new NoFly());
		myduck.setQuackBehavior(new QuackLoud());
		myduck.display();
		
		myduck = new DuckB();
		myduck.setFlyBehavior(new FlyWithWings());
		myduck.setQuackBehavior(new NoQuack());
		myduck.display();
		
		
	}
}
