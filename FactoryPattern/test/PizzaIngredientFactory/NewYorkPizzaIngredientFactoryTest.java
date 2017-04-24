package PizzaIngredientFactory;

import static org.junit.Assert.*;

import org.junit.Test;

import PizzaIngredient.NewYorkCheese;

public class NewYorkPizzaIngredientFactoryTest {

	@Test
	public void test() {
		PizzaIngredientFactory pizzaIngredientFactory=new NewYorkPizzaIngredientFactory();
		Pizza pizza=new NewYorkCheesePizza(pizzaIngredientFactory);
		
		System.out.println(pizza.getName());
	}

}
