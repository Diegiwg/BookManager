package view;

import config.Config;

public class LoginView implements View {
	@Override
	public void show() {
		System.out.println("Painel de Login | " + Config.SYS_INFO);

	}
}
