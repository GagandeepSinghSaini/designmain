package behaviorable.state;

public class RedLight implements IReciever {

	@Override
	public void on() {
		System.out.println("RedLight On");
	}

	@Override
	public void off() {
		System.out.println("RedLight Off");
	}

}
