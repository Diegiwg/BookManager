package model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.dao.UserDAO;
import model.entity.UserEntity;

public class UserService {
	private UserService() {
	}

	public static List<List<String>> listAllUsers() {
		List<UserEntity> usersObjs = UserDAO.listAllUsers();
		List<List<String>> users = new ArrayList<>();
		for (UserEntity user : usersObjs) {
			users.add(new ArrayList<>(Arrays.asList(String.valueOf(user.getId()), user.getName(), user.getEmail())));
		}
		return users;
	}
}
