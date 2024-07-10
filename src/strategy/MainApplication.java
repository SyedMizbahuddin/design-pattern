package strategy;

import strategy.Duck;
import strategy.RubberDuck;

public class MainApplication {

	public static void main(String[] args) {

		Duck rubber = new RubberDuck();

		rubber.fly();
		rubber.quack();
	}

}
