package observer;

public abstract class DisplayInterfac implements Observer {

	WeatherData weatherData;

	public abstract void display();
}
