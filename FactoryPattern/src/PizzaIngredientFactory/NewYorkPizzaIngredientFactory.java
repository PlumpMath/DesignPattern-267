package PizzaIngredientFactory;

import PizzaIngredient.Cheese;
import PizzaIngredient.Dough;
import PizzaIngredient.NewYorkCheese;
import PizzaIngredient.NewYorkDough;
import PizzaIngredient.NewYorkSauce;
import PizzaIngredient.Sauce;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new NewYorkDough();
	}

	@Override
	public Sauce createSauce() {
		return new NewYorkSauce();
	}

	@Override
	public Cheese createCheese() {
		return new NewYorkCheese();
	}

}
