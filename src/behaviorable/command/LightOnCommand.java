package behaviorable.command;

public class LightOnCommand implements ICommand {

	private ILight light;
	
	public LightOnCommand(ILight light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
