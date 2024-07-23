package iterator;

public class MainApplication {

	public static void main(String[] args) {

		Menu breakMenu = new BreakFastMenu();
		Menu lunchMenu = new LunchMenu();

		Waiter waiter = new Waiter(breakMenu, lunchMenu);

		waiter.print();

	}

}
