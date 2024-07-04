package decorator;

public class Espresso extends Beverage {

	@Override
	public Integer cost() {

		return 100;
	}

	@Override
	public String getDescription() {
		return "Espresso";
	}

}
