package main;

import controller.LibraryController;
import model.User;
import views.Home;

public class Main {

	public static void main(String[] args) {
		// NOTE: Criando Usuarios
		LibraryController.getInstance()
				.registerUser(new User("admin@email.com", "password_admin", "Admin", User.Role.ADMIN))
				.registerUser(new User("user1@email.com", "password_1", "Primeiro Usuario", User.Role.USER))
				.registerUser(new User("user2@email.com", "password_2", "Segundo Usuario", User.Role.USER))
				.registerUser(new User("user3@email.com", "password_3", "Terceiro Usuario", User.Role.USER))
				.registerUser(new User("user4@email.com", "password_4", "Quarto Usuario", User.Role.USER))
				.registerUser(new User("user5@email.com", "password_5", "Quinto Usuario", User.Role.USER));

		// NOTE: Instanciando a primeira View (Home)
		new Home();
	}

}
