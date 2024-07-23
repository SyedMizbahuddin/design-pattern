package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LunchIterator implements Iterator<MenuItem> {

	MenuItem[] menuItems;
	int ind;

	LunchIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
		this.ind = 0;
	}

	@Override
	public boolean hasNext() {
		return ind < menuItems.length;
	}

	@Override
	public MenuItem next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return menuItems[ind++];
	}

}
