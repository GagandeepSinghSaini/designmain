package behaviorable.state;

public class YellowState implements IState {

	private TrafficSystem trafficSystem;
	private IReciever reciever;
	
	public YellowState(TrafficSystem trafficSystem, IReciever reciever) {
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
		if(trafficSystem.getPreviousState() instanceof RedState) {
			trafficSystem.setCurrentState(trafficSystem.getGreenState());
		}else {
			trafficSystem.setCurrentState(trafficSystem.getRedState());
		}
		trafficSystem.setPreviousState(this);
	}

	@Override
	public void displayState() {
		reciever.on();
	}

}
