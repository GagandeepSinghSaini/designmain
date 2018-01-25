package behaviorable.command;

public class Client {

	public static void main(String[] args) {
		RemoteInvoker invoke = new RemoteInvoker();
		ILight light = new RoomLight();
		ICommand command = new LightOnCommand(light);
		invoke.setCommand(command);
		invoke.buttonPressed();
		
		command = new LightOffCommand(light);
		invoke.setCommand(command);
		invoke.buttonPressed();
		
		IDoor door = new RoomDoor();
		command = new DoorCloseCommand(door);
		invoke.setCommand(command);
		invoke.buttonPressed();
		
		light = new GarageLight();
		command = new LightOnCommand(light);
		invoke.setCommand(command);
		invoke.buttonPressed();
	}
	
}
