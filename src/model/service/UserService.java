package model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.dao.UserDAO;
import model.entity.UserEntity;

public class UserService {
	private UserService() {
	}

	private static UserEntity userEntity(String[] user) {
		try {
			int id = Integer.parseInt(user[0]);
			return new UserEntity(id, user[1], user[2], user[3]);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static List<UserEntity> listAllUsers() {
		String[][] usersObjs = UserDAO.listAllUsers();

		List<UserEntity> users = new ArrayList<>();
		for (String[] user : usersObjs) {
			users.add(userEntity(user));
		}

		return users;
	}

	public static String[][] listAllUsers_String() {
		String[][] usersObjs = UserDAO.listAllUsers();

		ArrayList<ArrayList<String>> users = new ArrayList<>();
		for (String[] user : usersObjs) {
			UserEntity m_user = userEntity(user);
			users.add(new ArrayList<>(
					Arrays.asList(String.valueOf(m_user.getId()), m_user.getName(), m_user.getEmail())));
		}

		String[][] result = new String[users.size()][];
		for (int i = 0; i < users.size(); i++) {
			result[i] = users.get(i).toArray(new String[0]);
		}
		return result;
	}
}
