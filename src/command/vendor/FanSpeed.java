package command.vendor;

public enum FanSpeed {

	LOW(1),
	MEDIUM(2),
	HIGH(3),
	OFF(0);

	private int speed;

	FanSpeed(int speed) {
		this.speed = speed;
	}
}
