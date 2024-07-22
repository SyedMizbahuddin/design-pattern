package factory.store;

import factory.pizza.Pizza;

public abstract class PizzaStore2 {
	/*
	 * This is if we have a multiple pizza store
	 * 
	 * This is Factory Method pattern
	 * 
	 * Where the sub class decides which store to be used
	 * 
	 */

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public abstract Pizza createPizza(String type);
}
