package behaviorable.state;

public class GreenState implements IState {

	private TrafficSystem trafficSystem;
	private IReciever reciever;
	
	public GreenState(TrafficSystem trafficSystem, IReciever reciever) {
		this.trafficSystem = trafficSystem;
		this.reciever = reciever;
	}
	
	public TrafficSystem getTrafficSystem() {
		return trafficSystem;
	}

	public void setTrafficSystem(TrafficSystem trafficSystem) {
		this.trafficSystem = trafficSystem;
	}

	public IReciever getReciever() {
		return reciever;
	}

	public void setReciever(IReciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public void changeState() {
		reciever.off();
		trafficSystem.setPreviousState(this);
		trafficSystem.setCurrentState(trafficSystem.getYellowState());
	}

	@Override
	public void displayState() {
		reciever.on();
	}

}
