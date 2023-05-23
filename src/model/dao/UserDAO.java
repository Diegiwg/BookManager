package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controller.DatabaseController;
import model.entity.UserEntity;

public class UserDAO {
	private UserDAO() {
	}

	private static UserEntity userEntity(ResultSet set) {
		try {
			return new UserEntity(set.getInt("id"), set.getString("name"), set.getString("email"),
					set.getString("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static List<UserEntity> listAllUsers() {
		try (Statement statement = DatabaseController.connection().createStatement()) {
			ResultSet result = statement.executeQuery("SELECT * FROM users;");

			List<UserEntity> users = new ArrayList<>();
			while (result.next()) {
				UserEntity user = userEntity(result);
				users.add(new UserEntity(user.getId(), user.getName(), user.getEmail()));
			}
			return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Collections.emptyList();
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
