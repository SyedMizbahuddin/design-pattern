package factory.factory;

import factory.pizza.CheesePizza;
import factory.pizza.Pizza;
import factory.pizza.VegPizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		switch (type) {
		case CheesePizza.name:
			pizza = new CheesePizza();
			break;
		case VegPizza.name:
			pizza = new VegPizza();
			break;
		}

		return pizza;
	}
}
