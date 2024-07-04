package observer;

public class MainApplication {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();

		Observer current = new CurrentCondition(weatherData);
		Observer forecast = new Forecast(weatherData);

		weatherData.setMeasurements(100, 0, 0);
	}

}
