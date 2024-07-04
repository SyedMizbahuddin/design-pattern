package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	List<Observer> observers;
	int temperature, humidity, pressure;

	WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}

	public void setMeasurements(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

	public void measurementChanged() {
		notifyObservers();
	}

}
