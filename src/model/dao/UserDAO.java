package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controller.DatabaseController;
import model.entity.UserEntity;

public class UserDAO {
	private UserDAO() {
	}

	public static String[][] listAllUsers() {
		try (Statement statement = DatabaseController.connection().createStatement()) {
			ResultSet result = statement.executeQuery("SELECT * FROM users;");

			ArrayList<String[]> users = new ArrayList<>();
			while (result.next()) {
				String[] user = { String.valueOf(result.getInt("id")), result.getString("name"),
						result.getString("email"), result.getString("password") };
				users.add(user);
			}

			String[][] m_users = new String[users.size()][];
			for (int i = 0; i < users.size(); i++) {
				m_users[i] = users.get(i);
			}
			return m_users;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void addUser(UserEntity user) {
		try (PreparedStatement statement = DatabaseController.connection()
				.prepareStatement("INSERT INTO users (name, email, password) VALUES (?, ?, ?)")) {
			statement.setString(1, user.getName());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getPassword());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
