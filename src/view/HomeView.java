package view;

import controller.NavigatorController;
import model.dao.UserDAO;
import model.entity.UserEntity;
import view.components.Menu;
import view.components.MenuOption;

public class HomeView implements View {
	@Override
	public void show() {
		System.out.print("\033[H\033[2J");
		System.out.println("Home View");

		new Menu( //
				new MenuOption("List All Users", nda -> NavigatorController.navigateTo(new ListAllUsersView())),
				new MenuOption("Create User", nda -> {
					UserDAO.addUser(new UserEntity("ADM", "adm@email.com", "password"));
					show();
				}), new MenuOption("Exit", nda -> System.exit(0)));

	}
}
