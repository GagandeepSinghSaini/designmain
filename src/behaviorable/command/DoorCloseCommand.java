package behaviorable.command;

public class DoorCloseCommand implements ICommand {

	private IDoor door;
	
	public DoorCloseCommand(IDoor door) {
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.close();
	}

}