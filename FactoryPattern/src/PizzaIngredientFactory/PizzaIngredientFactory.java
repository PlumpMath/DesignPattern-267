package PizzaIngredientFactory;

import PizzaIngredient.Cheese;
import PizzaIngredient.Dough;
import PizzaIngredient.Sauce;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
}
