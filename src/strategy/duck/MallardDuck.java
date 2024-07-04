package strategy.duck;

import strategy.duck.fly.FlyHigh;
import strategy.duck.quack.MuteQuack;

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
