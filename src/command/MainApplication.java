package command;

import command.commands.Command;
import command.commands.FanLowCommand;
import command.commands.FanOffCommand;
import command.commands.LightOffCommand;
import command.commands.LightOnCommand;
import command.vendor.Fan;
import command.vendor.Light;

public class MainApplication {

	public static void main(String[] args) {

		Light kitchen = new Light("Kitchen");
		Command lightOnCommand = new LightOnCommand(kitchen);
		Command lightOffCommand = new LightOffCommand(kitchen);

		Fan tableFan = new Fan("table");
		Command fanLowCommand = new FanLowCommand(tableFan);
		Command fanOffCommand = new FanOffCommand(tableFan);

		Remote remote = new Remote();

		remote.setCommand(0, lightOnCommand, lightOffCommand);
		remote.setCommand(1, fanLowCommand, fanOffCommand);

		remote.pressOn(0);
		remote.pressOn(1);
		remote.undo();
		remote.pressOff(0);
	}

}
