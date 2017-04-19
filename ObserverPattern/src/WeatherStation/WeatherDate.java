package WeatherStation;

import java.util.ArrayList;

public class WeatherDate implements Subject {

	private float tempature;
	private float humidity;
	private float pressure;
	private ArrayList<Observe> observes;

	public WeatherDate() {
		observes = new ArrayList<Observe>();
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public float getTempature() {
		return tempature;
	}

	@Override
	public void notifyObserve() {
		for (int i = 0; i < observes.size(); i++) {
			Observe o = (Observe) observes.get(i);
			o.update(tempature, humidity, pressure);
		}
	}

	public void dataChanged() {
		notifyObserve();
	}
	
	public void setParameters(float tempature,float humidity,float pressure){
		this.tempature=tempature;
		this.humidity=humidity;
		this.pressure=pressure;
		dataChanged();
	}
	@Override
	public void registerObserve(Observe o) {
		observes.add(o);

	}

	@Override
	public void removeObserve(Observe o) {
		int index = observes.indexOf(o);
		if (index != 0) {
			observes.remove(index);
		}
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public void setTempature(float tempature) {
		this.tempature = tempature;
	}

}
