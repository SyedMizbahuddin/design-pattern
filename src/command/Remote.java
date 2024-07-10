package command;

import command.commands.Command;
import command.commands.NoCommand;

public class Remote {

	Command[] onCommand;
	Command[] offCommand;

	Command lastCommand;

	Remote() {
		onCommand = new Command[5];
		offCommand = new Command[5];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 5; i++) {
			onCommand[i] = noCommand;
			offCommand[i] = noCommand;
		}

	}

	public void setCommand(int index, Command on, Command off) {
		onCommand[index] = on;
		offCommand[index] = off;
	}

	public void pressOn(int index) {
		lastCommand = onCommand[index];
		onCommand[index].execute();
	}

	public void pressOff(int index) {
		lastCommand = offCommand[index];
		offCommand[index].execute();
	}

	public void undo() {
		lastCommand.undo();
	}
}
