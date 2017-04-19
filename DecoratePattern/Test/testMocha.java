import org.junit.Test;

public class testMocha {
	@Test
	public void testMochas(){
		Beverage beverage=new Espresso();
		
		Beverage mocha=new Mocha(beverage);
		Beverage mocha2=new Mocha(mocha);
		
		System.out.println("The coffee is "+mocha2.getDescription());
		System.out.println("The cost is "+mocha2.cost());
	}
}
