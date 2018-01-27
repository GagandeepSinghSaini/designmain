package behaviorable.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

	private List<IObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<IObserver>();
	}
	
	@Override
	public void registerObserver(IObserver observer) {
		if(observer != null) {
			observers.add(observer);
		}
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		int index = observers.indexOf(observer);
		if(index >= 0) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		for(IObserver observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperatue, float humidity, float pressure) {
		this.temperature = temperatue;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
