package controller;

import java.util.Scanner;

public class ScannerController {
	private static Scanner instance = new Scanner(System.in);

	private ScannerController() {
	}

	public static Scanner getInstance() {
		synchronized (ScannerController.class) {
			return instance;
		}
	}
}
