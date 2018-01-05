package behaviorable.strategy;

public class QuackLoud implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Duck quacks loud");
	}

}
