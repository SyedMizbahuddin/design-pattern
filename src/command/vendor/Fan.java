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
		speed = FanSpeed.LOW;
		System.out.println(name + " fan is low speed");
	}

	public void medium() {
		speed = FanSpeed.MEDIUM;
		System.out.println(name + " fan is medium speed");
	}

	public void high() {
		speed = FanSpeed.HIGH;
		System.out.println(name + " fan is high speed");
	}

	public FanSpeed getSpeed() {
		return speed;
	}

	public void setSpeed(FanSpeed fanSpeed) {
		switch (fanSpeed) {
		case LOW:
			low();
			break;
		case MEDIUM:
			medium();
			break;
		case HIGH:
			high();
			break;
		case OFF:
			off();
			break;
		default:

		}
		this.speed = fanSpeed;
	}

	public void off() {
		speed = FanSpeed.OFF;
		System.out.println(name + " fan is off");
	}
}
