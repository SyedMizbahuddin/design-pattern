package template;

public class Tea {

	void prepareRecipe() {
		boilWater();
		brewTeaBag();
		pourInCup();
		addLemon();
	}

	private void addLemon() {
		System.out.println("add Lemon");

	}

	private void pourInCup() {
		System.out.println("pour in cup");

	}

	private void brewTeaBag() {
		System.out.println("Brew tea");
	}

	private void boilWater() {
		System.out.println("Boil water");
	}

}
