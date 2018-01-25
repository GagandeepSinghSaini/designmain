package behaviorable.command;

public class LightOffCommand implements ICommand {

	private ILight light;
	
	public LightOffCommand(ILight light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

}
