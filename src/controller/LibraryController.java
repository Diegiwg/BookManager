package controller;

import model.Library;

public class LibraryController {
	private static Library instance = new Library();

	private LibraryController() {
	}

	public static Library getInstance() {
		synchronized (LibraryController.class) {
			return instance;
		}
	}

}
