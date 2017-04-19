package WeatherStationOFJava;

import java.util.Observable;
import java.util.Observer;

import WeatherStationOFJava.WeatherDataObservable;

public class currentObserveOFJava implements Observer {
	private float tempature;
	private float humidity;
	private float pressure; 
	private Observable o;
	
	public currentObserveOFJava(Observable o){
		this.o=o;
		o.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherDataObservable){
			WeatherDataObservable wdo=(WeatherDataObservable)o;
			this.tempature=wdo.getTempature();
			this.humidity=wdo.getHumidity();
			dispaly();
		}

	}
	public void dispaly(){
		System.out.println("The current tempature, humidity, pressure are "+tempature+" "+humidity+" "+pressure);
	}
}
