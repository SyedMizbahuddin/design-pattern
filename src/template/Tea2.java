package template;

public class Tea2 extends Beverage {

	@Override
	protected void addCondiment() {
		System.out.println("add Lemon");

	}

	@Override
	protected void brew() {
		System.out.println("Brew tea");

	}

}
