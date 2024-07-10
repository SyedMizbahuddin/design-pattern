package strategy;

import strategy.fly.FlyNot;
import strategy.quack.SqueakQuack;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.flyBehaviour = new FlyNot();
		this.quackBehaviour = new SqueakQuack();
	}

	@Override
	public void display() {
		System.out.println("I'm rubbery");
	}

}
