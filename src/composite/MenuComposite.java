package composite;

import java.util.ArrayList;
import java.util.List;

public class MenuComposite extends MenuComponent {

	List<MenuComponent> menuComponenets;
	String name;

	MenuComposite(String name) {
		menuComponenets = new ArrayList<>();
		this.name = name;

	}

	@Override
	public void print() {
		System.out.println(this.getClass().getSimpleName() + " " + getName());

		for (MenuComponent subComp : menuComponenets) {
			subComp.print();
		}
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponenets.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponenets.remove(menuComponent);
	}

	@Override
	public String getName() {
		return name;
	}

}
