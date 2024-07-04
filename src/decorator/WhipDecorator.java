package decorator;

public class WhipDecorator extends CondimentDecorator {

	WhipDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + "Whip";
	}

	@Override
	public Integer cost() {
		return beverage.cost() + 12;
	}

}
