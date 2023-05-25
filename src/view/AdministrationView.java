package view;

import config.Config;
import controller.NavigatorController;
import view.components.Menu;
import view.components.MenuOption;

public class AdministrationView implements View {
	@Override
	public void show() {
		System.out.println("Painel de Administração | " + Config.SYS_INFO);

		new Menu( //
				new MenuOption("List All Users", nda -> NavigatorController.navigateTo(new ListAllUsersView())),
				new MenuOption("Create User", nda -> NavigatorController.navigateTo(new CreateUserView())),
				new MenuOption("Exit", nda -> System.exit(0)));

	}
}
