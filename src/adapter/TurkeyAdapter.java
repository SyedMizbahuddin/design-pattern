package adapter;

public class TurkeyAdapter implements Duck {

	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	Turkey turkey;

	@Override
	public void quack() {
		turkey.gobble();

	}

	@Override
	public void fly() {
		turkey.fly();

	}

}
