package decorator;

public class MainApplication {

	public static void main(String[] args) {

		Beverage beverage1 = new Espresso();

		System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());

		Beverage beverage2 = new Espresso();
		beverage2 = new SoyDecorator(beverage2);
		System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

		Beverage beverage3 = new Espresso();
		beverage3 = new SoyDecorator(beverage3);
		beverage3 = new SoyDecorator(beverage3);
		beverage3 = new WhipDecorator(beverage3);
		System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
	}

}
