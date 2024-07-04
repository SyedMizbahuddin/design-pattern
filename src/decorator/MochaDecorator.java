package decorator;

public class MochaDecorator extends CondimentDecorator {

	MochaDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + "Mocha";
	}

	@Override
	public Integer cost() {
		return beverage.cost() + 10;
	}

}
