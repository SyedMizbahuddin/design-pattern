package observer;

public class CurrentCondition extends DisplayInterfac {

	CurrentCondition(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("The current temp is " + this.weatherData.temperature);
	}

	@Override
	public void update() {
		display();
	}

}
