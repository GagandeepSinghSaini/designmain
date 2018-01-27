package behaviorable.strategy;

public class DuckB extends Duck {

	@Override
	public void display() {
		System.out.println("Displaying Duck B");
		fly.fly();
		quack.quack();
	}

	
}
