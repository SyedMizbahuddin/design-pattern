package simuduck.duck;

import simuduck.duck.fly.FlyNot;
import simuduck.duck.quack.SqueakQuack;

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
