package behaviorable.observer_built_in;

import java.util.Observer;

public class WeatherStation {

	public static void main(String[] args) {
		System.out.println("START");
		WeatherData data = new WeatherData();
		Observer observer1 = new DisplayX(data);
		Observer observer2 = new DisplayY(data);
		data.setMeasurements(10, 20, 30);
		data.setMeasurements(40, 50, 60);
		System.out.println("END");
	}
}
