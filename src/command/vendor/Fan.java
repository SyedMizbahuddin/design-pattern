package command.vendor;

public class Fan {
	String name;
	FanSpeed speed;

	public Fan(String name) {
		this.name = name;
		speed = FanSpeed.OFF;

	}

	public void on() {
		System.out.println(name + " fan is on");
	}

	public void low() {
		System.out.println(name + " fan is low speed");
	}

	public void medium() {
		System.out.println(name + " fan is medium speed");
	}

	public void high() {
		System.out.println(name + " fan is high speed");
	}

	public FanSpeed getSpeed() {
		return speed;
	}

	public void setSpeed(FanSpeed fanSpeed) {
		this.speed = fanSpeed;
	}

	public void off() {
		System.out.println(name + " fan is off");
	}
}