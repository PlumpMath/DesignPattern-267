package PizzaStore_FactoryPattern;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	public Pizza create(String pizzaName) {
		if(pizzaName=="NewYorkBeefPizza"){
			return new NewYorkBeefPizza();
		}
		else if(pizzaName==""){
			return new NewYorkOnionPizza();
		}
		else{
			return null;
		}
	}

}
