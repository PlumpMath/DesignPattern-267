
public class Espresso extends Beverage {

	@Override
	public String getDescription() {
		return super.getDescription() + " Escpresso";
	}

	@Override
	public double cost() {
		return 10;
	}

}
