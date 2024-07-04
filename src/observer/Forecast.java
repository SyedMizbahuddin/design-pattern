package observer;

public class Forecast implements DisplayInterfac, Observer {

	WeatherData weatherData;

	Forecast(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("The Forecast temp is " + this.weatherData.temperature + 5);
	}

	@Override
	public void update() {
		display();
	}

}
