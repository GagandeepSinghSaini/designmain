package behaviorable.strategy;

public class NoQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Duck does not quack");
	}

}
