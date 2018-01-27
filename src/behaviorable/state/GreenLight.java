package behaviorable.state;

public class GreenLight implements IReciever {

	@Override
	public void on() {
		System.out.println("Green light on");
	}

	@Override
	public void off() {
		System.out.println("Green Light off");
	}

}
