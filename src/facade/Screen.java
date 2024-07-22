package facade;

public class Screen {

	public void on() {
		System.out.println(this.getClass().getSimpleName() + " on");
	}

	public void off() {
		System.out.println(this.getClass().getSimpleName() + " off");
	}

}
