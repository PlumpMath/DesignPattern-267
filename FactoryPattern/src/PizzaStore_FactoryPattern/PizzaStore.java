package PizzaStore_FactoryPattern;

public abstract class PizzaStore {
	public Pizza orderPizza(String pizzaName){
		Pizza pizza;
		pizza=create(pizzaName);
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	public abstract Pizza create(String pizzaName);
	
}
