package strategy.duck;

import strategy.duck.fly.FlyNot;
import strategy.duck.quack.SqueakQuack;

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
