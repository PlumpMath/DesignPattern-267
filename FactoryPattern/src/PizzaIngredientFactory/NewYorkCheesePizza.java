package PizzaIngredientFactory;

public class NewYorkCheesePizza extends Pizza {
	PizzaIngredientFactory PizzaIngredientFactory;
	public NewYorkCheesePizza(PizzaIngredientFactory PizzaIngredientFactory) {
		this.PizzaIngredientFactory=PizzaIngredientFactory;
		name="NewYorkCheesePizza";
	}
	@Override
	public void prepare() {
		sauce=PizzaIngredientFactory.createSauce();
		cheese=PizzaIngredientFactory.createCheese();
		dough=PizzaIngredientFactory.createDough();

	}

}
