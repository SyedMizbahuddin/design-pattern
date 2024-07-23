package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakFastMenu implements Menu {
	List<MenuItem> menuItems;

	BreakFastMenu() {
		menuItems = new ArrayList<>();
		menuItems.add(new MenuItem("Egg"));
		menuItems.add(new MenuItem("Bread"));
		menuItems.add(new MenuItem("Dosa"));
		menuItems.add(new MenuItem("Idli"));
	}

	@Override
	public Iterator<MenuItem> getMenuItems() {
		return menuItems.iterator();
	}
}
