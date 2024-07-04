package strategy.duck;

import strategy.duck.Duck;
import strategy.duck.RubberDuck;

public class MainApplication {

	public static void main(String[] args) {

		Duck rubber = new RubberDuck();

		rubber.fly();
		rubber.quack();
	}

}
