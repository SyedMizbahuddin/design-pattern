package iterator;

import java.util.Iterator;

public class LunchMenu implements Menu {
	MenuItem[] menuItems;

	LunchMenu() {
		menuItems = new MenuItem[6];
		menuItems[0] = new MenuItem("Pizza");
		menuItems[1] = new MenuItem("Fried Rice");
		menuItems[2] = new MenuItem("Noodles");
		menuItems[3] = new MenuItem("Pasta");
		menuItems[4] = new MenuItem("Burger");
		menuItems[5] = new MenuItem("Pav");

	}

	@Override
	public Iterator<MenuItem> getMenuItems() {
		return new LunchIterator(menuItems);
	}
}
