package facade;

public class Amplifier {

	public void on() {
		System.out.println(this.getClass().getSimpleName() + " on");
	}

	public void off() {
		System.out.println(this.getClass().getSimpleName() + " off");
	}

}
