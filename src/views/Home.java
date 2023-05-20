package views;

import java.util.List;

import controller.LibraryController;
import model.User;

public class Home {

	public Home() {
		System.out.println("Bem Vindo a Biblioteca!");

		List<User> users = LibraryController.getInstance().getUsers();

		for (User user : users) {
			System.out.println(user.getFullName());
		}
	}

}
