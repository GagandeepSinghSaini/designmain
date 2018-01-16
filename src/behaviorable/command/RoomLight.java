package behaviorable.command;

public class RoomLight implements ILight {

	@Override
	public void on() {
		System.out.println("My Room Light is On");
	}

	@Override
	public void off() {
		System.out.println("My Room Light is Off");
	}

}
