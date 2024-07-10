package command.commands;

import command.vendor.Fan;
import command.vendor.FanSpeed;

public class FanHighCommand implements Command {

	Fan fan;
	FanSpeed prev;

	public FanHighCommand(Fan fan) {
		this.fan = fan;
		prev = fan.getSpeed();
	}

	@Override
	public void execute() {
		prev = fan.getSpeed();
		fan.high();
	}

	@Override
	public void undo() {
		fan.setSpeed(prev);
	}

}
