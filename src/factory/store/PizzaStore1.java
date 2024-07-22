package factory.store;

import factory.factory.SimplePizzaFactory;
import factory.pizza.Pizza;

public class PizzaStore1 {
	/*
	 * This is if we have a single pizza store
	 * 
	 * This is simple Factory pattern
	 * 
	 */
	SimplePizzaFactory simplePizzaFactory;

	public PizzaStore1(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = simplePizzaFactory.createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
