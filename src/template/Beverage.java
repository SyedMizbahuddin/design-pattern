package template;

public abstract class Beverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiment();
		if (hook1()) {
			// do anything
		}
		hook2();
	}

	protected void hook2() {
		// can be done by sub class
	}

	// can be overriden by sub class
	protected boolean hook1() {
		return false;
	}

	protected abstract void addCondiment();

	protected abstract void brew();

	private void pourInCup() {
		System.out.println("pour in cup");

	}

	private void boilWater() {
		System.out.println("Boil water");
	}
}
