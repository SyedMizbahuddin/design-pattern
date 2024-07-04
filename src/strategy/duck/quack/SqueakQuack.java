package strategy.duck.quack;

public class SqueakQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("I just squeak");
	}

}
