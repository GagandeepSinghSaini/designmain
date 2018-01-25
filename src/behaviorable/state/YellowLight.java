package behaviorable.state;

public class YellowLight implements IReciever {

	@Override
	public void on() {
		System.out.println("YellowLight is On");
	}

	@Override
	public void off() {
		System.out.println("YellowLight is Off");
	}

}
