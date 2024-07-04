package simuduck.duck;

import simuduck.duck.fly.FlyHigh;
import simuduck.duck.quack.MuteQuack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehaviour = new FlyHigh();
		this.quackBehaviour = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("I look red");
	}

}
