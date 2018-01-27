package behaviorable.command;

public class RoomDoor implements IDoor {

	@Override
	public void open() {
		System.out.println("My Room Door is Open");
	}

	@Override
	public void close() {
		System.out.println("My Room Door is Closed");
	}

}
