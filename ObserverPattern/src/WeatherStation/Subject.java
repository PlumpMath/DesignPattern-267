package WeatherStation;

public interface Subject {
	public void registerObserve(Observe o);
	public void removeObserve(Observe o);
	public void notifyObserve();
}
