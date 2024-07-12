package command.commands;

import command.vendor.Fan;
import command.vendor.FanSpeed;

public class FanMediumCommand implements Command {

	Fan fan;
	FanSpeed prev;

	public FanMediumCommand(Fan fan) {
		this.fan = fan;
		prev = fan.getSpeed();
	}

	@Override
	public void execute() {
		prev = fan.getSpeed();
		fan.medium();
	}

	@Override
	public void undo() {
		fan.setSpeed(prev);
	}

}
