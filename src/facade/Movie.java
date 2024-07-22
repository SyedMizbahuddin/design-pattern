package facade;

public class Movie {

	public void on() {
		System.out.println(this.getClass().getSimpleName() + " on");
	}

	public void off() {
		System.out.println(this.getClass().getSimpleName() + " off");
	}

}
