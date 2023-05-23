package controller;

import java.sql.Connection;
import java.sql.DriverManager;

import config.Config;

public class DatabaseController {
	private static DatabaseController instance;
	private Connection connectionInstance;

	private DatabaseController() {

	}

	private static DatabaseController getInstance() {
		if (instance == null) {
			instance = new DatabaseController();
		}
		return instance;
	}

	public static Connection connection() {
		try {
			getInstance().connectionInstance = DriverManager.getConnection(Config.DB_PATH);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return getInstance().connectionInstance;
	}

	public static void close() {
		try {
			getInstance().connectionInstance.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
