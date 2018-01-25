package behaviorable.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		IObserver observer1 = new DisplayA(weatherData);
		IObserver observer2 = new DisplayB(weatherData);
		
		weatherData.setMeasurements(11, 22, 33);
		weatherData.setMeasurements(55, 66, 77);
	}
	
}
