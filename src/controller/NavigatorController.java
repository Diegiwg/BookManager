package controller;

import java.util.ArrayList;

import view.View;

public class NavigatorController {
	private static NavigatorController instance;
	private ArrayList<View> history = new ArrayList<>();

	private NavigatorController() {
	}

	private static NavigatorController getInstance() {
		if (instance == null) {
			instance = new NavigatorController();
		}
		return instance;
	}

	public static void navigateTo(View view) {
		getInstance().history.add(view);
		show();
	}

	public static void navigateBack() {
		remove();
		show();
	}

	public static void show() {
		getInstance().history.get(getInstance().history.size() - 1).show();
	}

	private static void remove() {
		getInstance().history.remove(getInstance().history.size() - 1);
	}
}
