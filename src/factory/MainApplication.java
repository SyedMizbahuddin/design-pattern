package factory;

import factory.factory.SimplePizzaFactory;
import factory.store.NYStylePizzaStore2;
import factory.store.PizzaStore1;
import factory.store.PizzaStore2;

public class MainApplication {

	public static void main(String[] args) {
		PizzaStore1 simpleFactory = new PizzaStore1(new SimplePizzaFactory());
		simpleFactory.orderPizza("Cheese");

		PizzaStore2 factoryMethod = new NYStylePizzaStore2();
		factoryMethod.orderPizza("Cheese");

		/*
		 * Abstract factory
		 * 
		 * It creates a family of products - NYIngredientFactory.
		 * 
		 * createDough()
		 * 
		 * createSauce()
		 * 
		 * createCheese()
		 * 
		 * 
		 * For one kind, it creates all the products. It does not take any param , but
		 * can take
		 */
	}

}
