package view;

import java.util.List;

import controller.NavigatorController;
import model.dao.UserDAO;
import model.entity.UserEntity;
import view.components.Form;
import view.components.FormConfig;
import view.components.FormInput;
import view.components.FormInputTypes;

public class CreateUserView implements View {
	@Override
	public void show() {
		FormConfig config = new FormConfig("Create User");
		config.addInputs(new FormInput("Nome", FormInputTypes.TEXT), new FormInput("Email", FormInputTypes.TEXT),
				new FormInput("Senha", FormInputTypes.TEXT), new FormInput("Confirmar senha", FormInputTypes.TEXT));

		Form form = new Form(config);
		String command = form.show();
		if (command.equals("cmd::cancel")) {
			NavigatorController.navigateBack();
		}

		List<FormInput> inputs = form.results();
		if (!inputs.get(2).value.equals(inputs.get(3).value)) {
			System.out.println("Senhas não conferem");
			NavigatorController.show();
			return;
		}

		for (FormInput input : inputs) {
			if (input.value.isEmpty()) {
				System.out.println("Campo vazio: " + input.label);
				NavigatorController.show();
				return;
			}
		}

		UserDAO.addUser(new UserEntity(inputs.get(0).value, inputs.get(1).value, inputs.get(2).value));

		NavigatorController.navigateBack();
	}

}
