package behaviorable.command;

public class GagareDoor implements IDoor {

	@Override
	public void open() {
		System.out.println("My Garage Door is Open");
	}

	@Override
	public void close() {
		System.out.println("My Garage Door is Closed");
	}

}
