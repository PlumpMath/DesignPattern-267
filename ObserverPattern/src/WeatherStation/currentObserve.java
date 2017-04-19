package WeatherStation;


public class currentObserve implements Observe {

	private float tempature;
	private float humidity;
	private float pressure;
	private Subject WeatherDate;
	
	public void display() {
		System.out.println("The current tempature, humidity, pressure are "+tempature+" "+humidity+" "+pressure);
		
	}
	public Subject getWeatherDate() {
		return WeatherDate;
	}
	public void registerSubject(Subject s){
		this.WeatherDate=s;
		WeatherDate.registerObserve(this);
	}
	public void setWeatherDate(Subject weatherDate) {
		WeatherDate = weatherDate;
	}
	@Override
	public void update(float tempature, float humidity, float pressure) {
		this.tempature=tempature;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}
	

}
