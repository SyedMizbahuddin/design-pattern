package command.commands;

import command.vendor.Fan;
import command.vendor.FanSpeed;

public class FanLowCommand implements Command {

	Fan fan;
	FanSpeed prev;

	public FanLowCommand(Fan fan) {
		this.fan = fan;
		prev = FanSpeed.OFF;
	}

	@Override
	public void execute() {
		prev = fan.getSpeed();
		fan.low();
	}

	@Override
	public void undo() {
		fan.setSpeed(prev);
	}

}
