package behaviorable.observer_built_in;

import java.util.Observable;
import java.util.Observer;

public class DisplayX implements IObserver, Observer{

	private Observable observable;
	private float humidity;
	private float temperature;
	
	public DisplayX(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			this.temperature = data.getTemperature();
			this.humidity = data.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("DISPLAY-X: [temperature: "+temperature+", humidity: "+humidity+"]");
	}

}
