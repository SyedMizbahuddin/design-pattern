package decorator;

public abstract class Beverage {

	String description;

	public abstract Integer cost();

	public String getDescription() {
		return description;
	}
}
