package view.components;

import java.util.ArrayList;
import java.util.List;

public class FormConfig {
	public final String title;
	public final List<FormInput> inputs = new ArrayList<>();

	public FormConfig(String title) {
		this.title = title;
	}

	public void addInput(FormInput input) {
		inputs.add(input);
	}

	public void addInputs(FormInput... inputs) {
		for (FormInput input : inputs) {
			this.inputs.add(input);
		}
	}
}
