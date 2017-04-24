package PizzaIngredientFactory;

import PizzaIngredient.Cheese;
import PizzaIngredient.Dough;
import PizzaIngredient.Sauce;

public abstract class Pizza {
	String name;
	Dough dough;
	Cheese cheese;
	Sauce sauce;
	public abstract void prepare();
	public void bake(){
		
	}
	public void cut(){
		
	}
	public void box(){
		
	}
	public String getName(){
		return name;
	}
}
