package behaviorable.strategy;

public class FlyWithWings implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Duck Fly With Wings");
	}

}
