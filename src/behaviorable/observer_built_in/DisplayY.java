package behaviorable.observer_built_in;

import java.util.Observable;
import java.util.Observer;

public class DisplayY implements IObserver, Observer{

	private Observable observable;
	private float humidity;
	private float temperature;
	
	public DisplayY(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			this.humidity = data.getHumidity();
			this.temperature = data.getTemperature();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("DISPLAY-Y: [temperature: "+temperature+", humidity: "+humidity+"]");
	}

}
