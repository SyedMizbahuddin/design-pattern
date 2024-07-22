package factory.pizza;

public abstract class Pizza {

	private String type;

	Pizza(String type) {
		this.type = type;
	}

	public void prepare() {
		System.out.println("Preparing " + getType() + " " + this.getClass().getSimpleName());
	}

	public String getType() {
		return type;
	}

	public void bake() {
		System.out.println("Baking " + getType() + " " + this.getClass().getSimpleName());
	}

	public void cut() {
		System.out.println("Cutting " + getType() + " " + this.getClass().getSimpleName());
	}

	public void box() {
		System.out.println("Boxed " + getType() + " " + this.getClass().getSimpleName());
	}
}
