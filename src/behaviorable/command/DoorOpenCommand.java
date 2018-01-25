package behaviorable.command;

public class DoorOpenCommand implements ICommand {

	private IDoor door;
	
	public DoorOpenCommand(IDoor door) {
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.open();
	}

}
