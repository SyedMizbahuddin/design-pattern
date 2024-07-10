package strategy;

import strategy.fly.FlyHigh;
import strategy.quack.MuteQuack;

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
