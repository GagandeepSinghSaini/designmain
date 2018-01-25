package behaviorable.state;

public class TrafficSystem {

	private IState greenState;
	private IState yellowState;
	private IState redState;
	private IState previousState;
	private IState currentState;
	
	public TrafficSystem() {
		super();
		greenState = new GreenState(this, new GreenLight());
		redState = new RedState(this, new RedLight());
		yellowState = new YellowState(this, new YellowLight());
		IReciever initial = new GreenLight();
		previousState = new GreenState(this, initial);
		currentState = new GreenState(this, initial);
	}

	public IState getGreenState() {
		return greenState;
	}

	public IState getYellowState() {
		return yellowState;
	}

	public IState getRedState() {
		return redState;
	}

	public IState getPreviousState() {
		return previousState;
	}

	public void setPreviousState(IState previousState) {
		this.previousState = previousState;
	}

	public IState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(IState currentState) {
		this.currentState = currentState;
	}
	
	public void changeState() {
		getCurrentState().changeState();
	}
	
	public void displayState() {
		getCurrentState().displayState();
	}
	
}
