package command.commands;

import command.vendor.Fan;
import command.vendor.FanSpeed;

public class FanOffCommand implements Command {

	Fan fan;
	FanSpeed prev;

	public FanOffCommand(Fan fan) {
		this.fan = fan;
		prev = FanSpeed.OFF;
	}

	@Override
	public void execute() {
		prev = fan.getSpeed();
		fan.off();
	}

	@Override
	public void undo() {
		fan.setSpeed(prev);
	}

}
