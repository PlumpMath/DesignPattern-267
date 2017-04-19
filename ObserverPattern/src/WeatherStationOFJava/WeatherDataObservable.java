package WeatherStationOFJava;

import java.util.Observable;

public class WeatherDataObservable extends Observable{
	private float tempature;
	private float humidity;
	private float pressure;
	
	public WeatherDataObservable() {
		// TODO Auto-generated constructor stub
	}
	
	public void measurementChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setParameters(float tempature,float humidity,float pressure){
		this.tempature=tempature;
		this.humidity=humidity;
		this.pressure=pressure;
		setChanged();
	}
	
	public float getTempature() {
		return tempature;
	}
	public void setTempature(float tempature) {
		this.tempature = tempature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
}
