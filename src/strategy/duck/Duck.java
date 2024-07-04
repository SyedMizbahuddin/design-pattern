package strategy.duck;

import strategy.duck.fly.FlyBehaviour;
import strategy.duck.quack.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public abstract void display();

	public void swim() {
		System.out.println("Swim like an angel");
	}

	public void fly() {
		flyBehaviour.fly();
	}

	public void quack() {
		quackBehaviour.quack();
	}

}
