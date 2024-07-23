package iterator;

import java.util.Iterator;

public class Waiter {
	Menu breakFastMenu;
	Menu lunchMenu;

	public Waiter(Menu breakFastMenu, Menu lunchMenu) {
		super();
		this.breakFastMenu = breakFastMenu;
		this.lunchMenu = lunchMenu;
	}

	void print() {
		print(breakFastMenu.getMenuItems());
		print(lunchMenu.getMenuItems());
	}

	private void print(Iterator<MenuItem> menuItems) {
		while (menuItems.hasNext()) {
			MenuItem item = menuItems.next();
			System.out.println(item.getName());
		}
	}

}
