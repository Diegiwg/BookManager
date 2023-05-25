package view.components;

public class FormInput {
	public final String label;
	public final FormInputTypes type;
	public String value;

	public FormInput(String label, FormInputTypes type) {
		this.label = label;
		this.type = type;
		this.value = null;
	}
}
