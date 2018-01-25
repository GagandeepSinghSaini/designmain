package behaviorable.strategy;

public class NoFly implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Duck Does Not Fly");

	}

}
