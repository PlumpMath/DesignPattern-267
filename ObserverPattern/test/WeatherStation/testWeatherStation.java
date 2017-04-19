package WeatherStation;

import org.junit.Test;

public class testWeatherStation {

	@Test
	public void test() {
		WeatherDate s=new WeatherDate();
		
		currentObserve o1=new currentObserve();
		currentObserve o2=new currentObserve();
		currentObserve o3=new currentObserve();
		
		o1.registerSubject(s);
		o2.registerSubject(s);
		o3.registerSubject(s);
		
		System.out.println(o1.getWeatherDate());
		s.setParameters(30, 40, 50);
	}
	
}
