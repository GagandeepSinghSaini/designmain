package behaviorable.command;

public class RemoteInvoker {
	
	private ICommand command;
	
	public RemoteInvoker() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void buttonPressed() {
		command.execute();
	}
	
}
