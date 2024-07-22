package template;

public class MainApplication {

	public static void main(String[] args) {
		Tea tea = new Tea();
		tea.prepareRecipe();

		Coffee coffee = new Coffee();
		coffee.prepareRecipe();

		// Template Algo method should be final
		Beverage teaBev = new Tea2();
		teaBev.prepareRecipe();
	}

}
