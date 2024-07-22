package factory.store;

import factory.pizza.NYCheesePizza2;
import factory.pizza.NyVegPizza2;
import factory.pizza.Pizza;

public class NYStylePizzaStore2 extends PizzaStore2 {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		switch (type) {
		case NYCheesePizza2.name:
			pizza = new NYCheesePizza2();
			break;
		case NyVegPizza2.name:
			pizza = new NyVegPizza2();
			break;
		}

		return pizza;
	}

}
