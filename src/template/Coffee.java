package template;

public class Coffee {

	void prepareRecipe() {
		boilWater();
		brewCaffine();
		pourInCup();
		addMilk();
	}

	private void addMilk() {
		System.out.println("add Milk");

	}

	private void pourInCup() {
		System.out.println("pour in cup");

	}

	private void brewCaffine() {
		System.out.println("Brew caffine");
	}

	private void boilWater() {
		System.out.println("Boil water");
	}

}
