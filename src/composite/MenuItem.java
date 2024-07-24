package composite;

public class MenuItem extends MenuComponent {

	private String name;

	public MenuItem(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void print() {
		System.out.println(this.getClass().getSimpleName() + " " + getName());
	}

}
