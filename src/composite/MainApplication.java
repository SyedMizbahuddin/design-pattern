package composite;

public class MainApplication {

	public static void main(String[] args) {
		/*
		 * This is the most compromised pattern
		 * 
		 * It does not follow many rules.
		 */

		MenuComponent breakFastMenu = new MenuComposite("Breakfast");
		MenuComponent breakItem1 = new MenuItem("Dosa");
		MenuComponent breakItem2 = new MenuItem("Idli");
		MenuComponent breakItem3 = new MenuItem("Vada");
		MenuComponent breakItem4 = new MenuItem("Poori");

		breakFastMenu.add(breakItem1);
		breakFastMenu.add(breakItem2);
		breakFastMenu.add(breakItem3);
		breakFastMenu.add(breakItem4);

		MenuComponent lunchMenu = new MenuComposite("Lunch");
		MenuComponent lunchItem1 = new MenuItem("Pizza");
		MenuComponent lunchItem2 = new MenuItem("Burger");
		MenuComponent lunchItem3 = new MenuItem("Sausage");
		MenuComponent lunchItem4 = new MenuItem("Fries");

		lunchMenu.add(lunchItem1);
		lunchMenu.add(lunchItem2);
		lunchMenu.add(lunchItem3);
		lunchMenu.add(lunchItem4);

		breakFastMenu.print();
		lunchMenu.print();

		// We can also add sub menu along with menu Items internally
		breakFastMenu.add(lunchMenu);
		breakFastMenu.print();

	}

}
