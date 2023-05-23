package view.components;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import controller.NavigatorController;

public class Menu {

	public Menu(MenuOption... options) {
		Map<Integer, MenuOption> mOptions = new HashMap<>();
		Arrays.stream(options).forEach(option -> mOptions.put(mOptions.size() + 1, option));
		mOptions.forEach((index, data) -> System.out.println(index + " - " + data.getLabel()));

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.print("> ");
				String userOption = scanner.next();

				if (!userOption.matches("\\d+")) {
					NavigatorController.show();
					continue;
				}

				int mIndex = Integer.parseInt(userOption);
				if (!mOptions.containsKey(mIndex)) {
					NavigatorController.show();
					continue;
				}

				mOptions.get(mIndex).execute();
				return;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
