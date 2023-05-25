package view.components;

import java.util.List;
import java.util.Scanner;

public class Form {
	private FormConfig config;

	private static boolean checkCorrectType(String value, FormInputTypes type) {
		try {
			if (type == FormInputTypes.TEXT) {
				try {
					Integer.parseInt(value);
				} catch (NumberFormatException e) {
					return true;
				}
			} else if (type == FormInputTypes.NUMBER) {
				Double.parseDouble(value);
				return true;
			} else if (type == FormInputTypes.BOOLEAN) {
				Boolean.parseBoolean(value);
				return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}

		return false;
	}

	public Form(FormConfig config) {
		this.config = config;
	}

	public String show() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println(this.config.title);
			System.out.println("Comando de Saida: cmd::cancel");

			for (FormInput input : this.config.inputs) {
				while (true) {
					System.out.println(input.label + ":");
					String answer = scanner.nextLine();

					if (answer.equals("cmd::cancel")) {
						return "cmd::cancel";
					}

					if (!checkCorrectType(answer, input.type)) {
						continue;
					}

					input.value = answer;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "null";
	}

	public List<FormInput> results() {
		return this.config.inputs;
	}
}
