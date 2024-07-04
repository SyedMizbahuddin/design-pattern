package decorator;

public class Decaf extends Beverage {
	@Override
	public Integer cost() {

		return 150;
	}

	@Override
	public String getDescription() {
		return "Decaf";
	}

}
