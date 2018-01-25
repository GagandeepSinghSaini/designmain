package behaviorable.command;

public class GarageLight implements ILight {

	@Override
	public void on() {
		System.out.println("My Garage Light is On");
	}

	@Override
	public void off() {
		System.out.println("my Garage Light is Off");
	}

}
