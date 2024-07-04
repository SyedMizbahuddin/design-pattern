package decorator;

public class SoyDecorator extends CondimentDecorator {

	SoyDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + "Soy";
	}

	@Override
	public Integer cost() {
		return beverage.cost() + 15;
	}

}
