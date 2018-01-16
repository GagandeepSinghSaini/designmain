package behaviorable.observer;

public class DisplayA implements IDisplayElement, IObserver {

	private ISubject subject;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public DisplayA(ISubject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();

	}

	@Override
	public void display() {
		System.out.println("DISPLAY-A: ["+temperature+", "+humidity+", "+pressure+"]");
	}

}
