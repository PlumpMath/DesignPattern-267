package PizzaStore;


import org.junit.Test;

import PizzaStore_FactoryPattern.NewYorkPizzaStore;
import PizzaStore_FactoryPattern.Pizza;
import PizzaStore_FactoryPattern.PizzaStore;

public class NewYorkPizzaStoreTest {

	@Test
	public void test() {
		PizzaStore pizzaStore=new NewYorkPizzaStore();
		Pizza pizza=pizzaStore.orderPizza("NewYorkBeefPizza");
		
		System.out.println(pizza.getName());
	}

}
