package facade;

public class Light {

	public void on() {
		System.out.println(this.getClass().getSimpleName() + " on");
	}

	public void off() {
		System.out.println(this.getClass().getSimpleName() + " off");
	}

}
