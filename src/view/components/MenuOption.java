package view.components;

import java.util.function.Consumer;

public class MenuOption {
	private String label;
	private Consumer<Void> command;

	public MenuOption(String label, Consumer<Void> command) {
		this.label = label;
		this.command = command;
	}

	public String getLabel() {
		return label;
	}

	public void execute() {
		command.accept(null);
	}
}
