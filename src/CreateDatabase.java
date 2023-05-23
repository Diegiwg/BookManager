import java.sql.SQLException;
import java.sql.Statement;

import controller.DatabaseController;

public class CreateDatabase {
	public static void main(String[] args) throws SQLException {
		try (Statement statement = DatabaseController.connection().createStatement()) {
			String id = "id INTEGER PRIMARY KEY AUTOINCREMENT,";

			statement.executeUpdate("CREATE TABLE IF NOT EXISTS users (" + id
					+ "name TEXT NOT NULL, email TEXT NOT NULL UNIQUE, password TEXT NOT NULL);");

			statement.executeUpdate("CREATE TABLE IF NOT EXISTS books (" + id
					+ "title TEXT NOT NULL, author TEXT NOT NULL, year INTEGER NOT NULL,"
					+ "owner_id INTEGER NOT NULL, FOREIGN KEY (owner_id) REFERENCES users(id));");

			statement.executeUpdate("CREATE TABLE IF NOT EXISTS book_owner (" + id
					+ "book_id INTEGER NOT NULL, owner_id INTEGER NOT NULL,"
					+ "FOREIGN KEY (book_id) REFERENCES books(id), FOREIGN KEY (owner_id) REFERENCES users(id));");

			System.out.println("Database created successfully. You can now use the application.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
