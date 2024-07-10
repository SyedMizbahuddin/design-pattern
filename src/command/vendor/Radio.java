package command.vendor;

public class Radio {
	int volume;

	Radio() {
		volume = 0;
	}

	public void on() {
		System.out.println("Radio is on");
	}

	public void removeCD() {
		System.out.println("Radio CD is removed ");
	}

	public void setCD() {
		System.out.println("Radio has got a CD");
	}

	public void setVolume(int num) {
		volume = num;
		System.out.println("Radio volume " + num);
	}
}
