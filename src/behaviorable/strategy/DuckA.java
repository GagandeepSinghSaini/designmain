package behaviorable.strategy;

public class DuckA extends Duck {

	@Override
	public void display() {
		System.out.println("Displaying Duck A");
		fly.fly();
		quack.quack();
	}

}
