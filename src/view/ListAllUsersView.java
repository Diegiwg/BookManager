package view;

import controller.NavigatorController;
import model.service.UserService;
import view.components.Menu;
import view.components.MenuOption;
import view.components.Table;

public class ListAllUsersView implements View {
	@Override
	public void show() {
		System.out.println("List All Users View");

		String[] h = { "ID", "Nome", "Email" };
		String[][] r = UserService.listAllUsers_String();

		Table t = new Table(h, r);
		t.showf();

		new Menu( //
				new MenuOption("Home", nda -> NavigatorController.navigateBack()),
				new MenuOption("Exit", nda -> System.exit(0)));
	}
}
